import React, { Component } from "react";
import './adminhome.css'
export default class Nav extends Component{
    render() {
        return (

            
                <div className ="sidebar">
                    <h2>CITIZENS ENGAGE</h2>
                    <ul>
                        <li><a href="/adminhome"><i className ="fas fa-home"></i>Home</a></li>
                        <li><a href="#"><i className="fas fa-address-card"></i>View Complaints</a></li>
                        <li><a href="#"><i className="fas fa-project-diagram"></i>Total Complaints</a></li>
                        <li><a href="#"><i className="fas fa-blog"></i>Pending Complaints</a></li>
                        <li><a href="#"><i className="fas fa-address-book"></i>Closed Complaints</a></li>
                        <li><a href="/Home"><i className="fas fa-map-pin"></i>Logout</a></li>
                    </ul> 
                
                </div>
               
        );
}
}