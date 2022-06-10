import { types } from "../types/types"


export const userReducers = (state = {}, action) => {
  switch (action.type) {
    case types.login:
      return {
        id: action.payload.email,
        name: action.payload.password
      }
    case types.logout:
      return {}
    case types.register:
      return {
        nombre: action.payload.nombre,
        email: action.payload.email,
        password: action.payload.password,
        password2: action.payload.password2,
      }

    default:
      return state
  }
}