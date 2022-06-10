import React from 'react'
import ListProducCards from './ListProductCards'
import Navbar from "./Navbar"



const Home = () => {
  return (
    <div className='home'>

      <Navbar />
      <ListProducCards />

    </div>
  )
}

export default Home