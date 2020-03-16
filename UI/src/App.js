import React ,{ Component } from 'react';

import { BrowserRouter as Router, 
  Switch, 
  Route } from "react-router-dom";
   import Login from "./components/home/login";
   import SignUp from "./components/home/signup";
   import Home from "./components/home/home";
   import UserHome from "./components/User/UserHome";
   import complaint from "./components/User/complaint";
   import Adminlogin from "./components/home/adminlogin.js"; 
   import About from "./components/home/about.js";
   import Adminhome from "./components/admin/Adminhome.js";
   import Profile from "./components/User/Profile.js";
   import EditProfile from "./components/User/EditProfile.js";
   //import Leaflet from "./components/User/leaflet.js";
   import ViewUsers from "./components/admin/viewusers.js";
   import ViewComplaints from "./components/admin/viewComplaints.js"
   import PendingComplaints from "./components/admin/pendingComplaints.js"
   import ClosedComplaints from "./components/admin/closedComplaints.js"
   import UserLogout from "./components/User/logout.js"
   import ViewUserComplaints from "./components/User/viewComplaints.js"
   import PendingUserComplaints from "./components/User/pendingComplaints.js"
   import ClosedUserComplaints from "./components/User/closedComplaints.js"
   import AdminLeaderboard from "./components/admin/leaderboard.js"
   import UserLeaderboard from "./components/User/leaderboard.js"
   import viewAndClose from "./components/admin/viewAndClose.js"
   import AdminLogout from "./components/admin/logout.js"
   import RecentlyCreated from "./components/admin/recentlyCreated.js"
   import RecentlyClosed from "./components/admin/recentlyClosed.js"
   import Marker from "./components/admin/marker.js"
   import UserMarker from "./components/User/userMarker.js"
   import ForgotPassword from "./components/home/forgotPassword.js";
   import TopRanked from "./components/admin/topRankedComplaint.js"
   import TopRankedList from "./components/admin/topRankedList.js"
   import ActiveRegions from "./components/admin/activeRegions.js"
   import LocationComplaints from "./components/admin/locationComplaints.js"
   import Form from "./components/admin/form.js"
  //  import Map from "./components/User/sample.js"

class App extends Component {
  // constructor(props) {
  //   super(props);
  // }
  render(){
    const userauthenticated = sessionStorage.getItem('UserName');
    const adminauthenticated = sessionStorage.getItem('AdminName');
    // console.log(userauthenticated, 'authenticated username')
    if (userauthenticated) {
      return(
        <div>
        <Router>
            <Switch>
        {/* <Route exact path="/" component={App} /> */}
        <Route exact path='/' component={ Home } />
        <Route exact path='/Home' component={ Home } />
        <Route path="/Login" component={ Login } />
        <Route path="/sign-up" component={ SignUp } />
        <Route path="/user-home" component={ UserHome }/>
        <Route path="/complaint" component={ complaint }/>
        <Route path="/adminlogin" component= {UserLogout}/>
        <Route path="/about" component= { About }/>
        <Route path="/adminhome" component= { UserLogout }/>
        <Route path="/viewusers" component= { UserLogout}/>
        <Route path="/profile" component= { Profile }/>
        <Route path="/editprofile" component= { EditProfile }/>
        <Route path="/viewcomplaints" component = {UserLogout}/>
        <Route path="/userLogout" component = {UserLogout}/>
        <Route path="/viewusercomplaints" component = {ViewUserComplaints}/>
        <Route path="/adminleaderboard" component = {UserLogout}/>
        <Route path="/userleaderboard" component = {UserLeaderboard}/>
        <Route path="/viewandclose" component = {UserLogout}/>
        <Route path="/adminLogout" component = {UserLogout}/>
        <Route path="/recentlycreated" component = {UserLogout}/>
        <Route path="/recentlyclosed" component = {UserLogout}/>
        <Route path="/marker" component = {UserLogout}/>
        <Route path="/usermarker" component = {UserMarker}/>
        <Route path="/forgotpassword" component = {ForgotPassword}/>
        <Route path="/topranked" component = {UserLogout}/>
        <Route path="/toprankedlist" component = {UserLogout}/>
        <Route path="/activeregions" component = {UserLogout}/>
        <Route path="/locationComplaints" component = {UserLogout}/>
        <Route path="/form" component = {Form}/>

            </Switch>
        </Router>
        </div>
      )
    }
    else if(adminauthenticated){

      return(
      <div>
      <Router>
          <Switch>
      {/* <Route exact path="/" component={App} /> */}
      <Route exact path='/' component={ Home } />
      <Route exact path='/Home' component={ Home } />
      <Route path="/Login" component={ Login } />
      <Route path="/sign-up" component={ SignUp } />
      <Route path="/user-home" component={ AdminLogout }/>
      <Route path="/complaint" component={ AdminLogout }/>
      <Route path="/adminlogin" component= { Adminlogin}/>
      <Route path="/about" component= { About }/>
      <Route path="/adminhome" component= { Adminhome }/>
      <Route path="/viewusers" component= { ViewUsers }/>
      <Route path="/profile" component= { AdminLogout }/>
      <Route path="/editprofile" component= { AdminLogout }/>
      <Route path="/viewcomplaints" component = {ViewComplaints}/>
      <Route path="/userLogout" component = {AdminLogout}/>
      <Route path="/viewusercomplaints" component = {AdminLogout}/>
      <Route path="/adminleaderboard" component = {AdminLeaderboard}/>
      <Route path="/userleaderboard" component = {AdminLogout}/>
      <Route path="/viewandclose" component = {viewAndClose}/>
      <Route path="/adminLogout" component = {AdminLogout}/>
      <Route path="/recentlycreated" component = {RecentlyCreated}/>
      <Route path="/recentlyclosed" component = {RecentlyClosed}/>
      <Route path="/marker" component = {Marker}/>
      <Route path="/usermarker" component = {AdminLogout}/>
      <Route path="/forgotpassword" component = {ForgotPassword}/>
      <Route path="/topranked" component = {TopRanked}/>
      <Route path="/activeregions" component = {ActiveRegions}/>
      <Route path="/toprankedlist" component = {TopRankedList}/>
      <Route path="/locationComplaints" component = {LocationComplaints}/>

      <Route path="/form" component = {Form}/>
          </Switch>
      </Router>
      </div>
  
  )
      
    }

  else {
    return(
    <div>
            <Router>
                <Switch>
            {/* <Route exact path="/" component={App} /> */}
      <Route exact path='/' component={ Home } />
      <Route exact path='/Home' component={ Home } />
      <Route path="/Login" component={ Login } />
      <Route path="/sign-up" component={ SignUp } />
      <Route path="/user-home" component={ Login  }/>
      <Route path="/complaint" component={ Login }/>
      <Route path="/adminlogin" component= { Adminlogin}/>
      <Route path="/about" component= { About }/>
      <Route path="/adminhome" component= { Adminlogin }/>
      <Route path="/viewusers" component= { Adminlogin }/>
      <Route path="/profile" component= { Login  }/>
      <Route path="/editprofile" component= { Login }/>
      <Route path="/viewcomplaints" component = {Adminlogin}/>
      <Route path="/userLogout" component = {Login }/>
      <Route path="/viewusercomplaints" component = {Login }/>
      <Route path="/adminleaderboard" component = {Adminlogin}/>
      <Route path="/userleaderboard" component = {Login}/>
      <Route path="/viewandclose" component = {Adminlogin}/>
      <Route path="/adminLogout" component = {Adminlogin}/>
      <Route path="/recentlycreated" component = {Adminlogin}/>
      <Route path="/recentlyclosed" component = {Adminlogin}/>
      <Route path="/marker" component = {Adminlogin}/>
      <Route path="/usermarker" component = {Login }/>
      <Route path="/forgotpassword" component = {ForgotPassword}/>
      <Route path="/topranked" component = {Adminlogin}/>
      <Route path="/toprankedlist" component = {Adminlogin}/>
      <Route path="/activeregions" component = {Adminlogin}/>
      <Route path="/locationComplaints" component = {Adminlogin}/>
      <Route path="/form" component = {Form}/>
                </Switch>
            </Router>
            </div>
        
  );
  }
}}

export default App;
