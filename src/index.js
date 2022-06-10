import React from 'react';
import ReactDOM from 'react-dom';
<<<<<<< HEAD
import './index.css';
import { Provider } from 'react-redux';
import { store } from './redux/store/store';
import AppRouters from './routers/AppRouters';
import Pagos from './components/Pagos';

ReactDOM.render(
  <Provider store={store}>
    <Pagos />
  </Provider>,
=======
import Home from './components/Home';
import { CartProvider } from './Context/CartContext';



ReactDOM.render(
  <CartProvider>
    <Home />
  </CartProvider>,
>>>>>>> develop
  document.getElementById('root')
);

