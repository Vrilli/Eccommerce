// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { GoogleAuthProvider } from "firebase/auth";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyDDyeerwsW-tgfbvmSge2oeTDUWqfISBRw",
  authDomain: "ecommerce-b2df3.firebaseapp.com",
  projectId: "ecommerce-b2df3",
  storageBucket: "ecommerce-b2df3.appspot.com",
  messagingSenderId: "1001186667571",
  appId: "1:1001186667571:web:a8b88fddd6b50139f14746"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const google = new GoogleAuthProvider();

export { app, google }