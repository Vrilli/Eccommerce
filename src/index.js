import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { store } from './redux/store/store';
// import AppRouters from './routers/AppRouters';
import  Home  from "./components/Home"
import Carrito from './components/Carrito';
import  {ItemsCart}  from "./components/ItemsCart"


ReactDOM.render(
  <Provider store={store}>
    {/* <AppRouters /> */}
    <ItemsCart />
  </Provider>,
  document.getElementById('root')
);

