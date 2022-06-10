import React from 'react'
import ListProducCards from './ListProductCards'
import Navbar from "./Navbar"
import "../styles/Home.css"
import { CartProvider } from '../Context/CartContext'


const Home = () => {
  return (
    <div className='home'>
      <CartProvider>
        <Navbar />
        <ListProducCards />
      </CartProvider>
    </div>
  )
}

export default Home
