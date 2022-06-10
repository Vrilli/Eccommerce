import React, { useContext, useState } from 'react'
import { loadStripe } from "@stripe/stripe-js";
import "bootswatch/dist/lux/bootstrap.min.css";
import { Elements, CardElement, useStripe, useElements} from "@stripe/react-stripe-js";

import axios from "axios";
import { CartContext } from '../Context/CartContext';

const stripePromise = loadStripe("pk_test_51L9AlzLrOmTtKtHD2DtVCVc9dLpEGdMGtWNeL9BeLMAgSMqhOLsNUnlGQvv1GzGPO8kEQM802K8eyMet4FrE4Pmt00AibQssCY");

const CheckoutForm = () => {
  const stripe = useStripe();
  const elements = useElements();

  const [loading, setLoading] = useState(false);

  const handleSubmit = async (e) => {
    e.preventDefault();

    const { error, paymentMethod } = await stripe.createPaymentMethod({
      type: "card",
      card: elements.getElement(CardElement),
    });
    setLoading(true);

    if (!error) {
      // console.log(paymentMethod)
      const { id } = paymentMethod;
      try {
        const { data } = await axios.post(
          "http://localhost:3001/api/checkout",
          {
            id,
            amount: 10000, //cents
          }
        );
        console.log(data);

        elements.getElement(CardElement).clear();
      } catch (error) {
        console.log(error);
      }
      setLoading(false);
    }
  };

  console.log(!stripe || loading);

  // const { cartItems } = useContext(CartContext);

  // const total = cartItems.reduce(
  //   (previous, current) => previous + current.amount * current.precio,
  //   0
  // );

  return (
    <form className="card card-body" onSubmit={handleSubmit}>
      {/* Product Information */}
      

      <h3 className="text-center my-2">Price: 100$</h3>

      {/* User Card Input */}
      <div className="form-group">
        <CardElement />
      </div>

      <button disabled={!stripe} className="btn btn-success">
        {loading ? (
          <div className="spinner-border text-light" role="status">
            <span className="sr-only">Loading...</span>
          </div>
        ) : (
          "Buy"
        )}
      </button>
    </form>
  );
};

const Pagos = () => {
  return (
    <Elements stripe={stripePromise}>
      <div className="container p-4">
        <div className="row h-100">
          <div className="col-md-4 offset-md-4 h-100">
            <CheckoutForm />
          </div>
        </div>
      </div>
    </Elements>
  )
}

export default Pagos