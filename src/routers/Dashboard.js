import { Route, Routes, Navigate } from "react-router-dom";
import Home from "../components/Home"
import Pagos from "../components/Pagos";



export const Dashboard = () => {



  return (
    <div>

      <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/pagos" element={<Pagos />} />
        <Route path="*" element={<Navigate to="/home" />} />
      </Routes>
    </div>
  )
}