import React from 'react';
import ReactDOM from 'react-dom';
import Home from './components/Home';
import { CartProvider } from './Context/CartContext';



ReactDOM.render(
  <CartProvider>
    <Home />
  </CartProvider>,
  document.getElementById('root')
);

