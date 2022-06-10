import React from 'react'
import ListProducCards from './ListProductCards'
import Navbar from "./Navbar"
import "../styles/Home.css"


const Home = () => {
  return (
    <div className='home'>

      <Navbar />
      <ListProducCards />

    </div>
  )
}

export default Home
