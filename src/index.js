import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import { Provider } from 'react-redux';
import { store } from './redux/store/store';
import Registro from './components/Registro';

ReactDOM.render(
  <Provider store={store}>
    <Registro />
  </Provider>,
  document.getElementById('root')
);

