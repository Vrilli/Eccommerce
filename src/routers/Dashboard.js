import { Route, Routes, Navigate } from "react-router-dom";
import Home from "../components/Home"



export const Dashboard = () => {



  return (
    <div>

      <Routes>

        <Route path="/home" element={<Home />} />
        <Route path="*" element={<Navigate to="/home" />} />
      </Routes>
    </div>
  )
}