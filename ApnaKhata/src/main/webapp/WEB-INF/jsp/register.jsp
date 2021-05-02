<!DOCTYPE html>
<html lang="en">
  

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Corona Admin</title>
    <link rel="stylesheet" href="assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="assets/vendors/css/vendor.bundle.base.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="shortcut icon" href="assets/images/favicon.png" />
  </head>
  <body>
    <div class="container-scroller">
      <div class="container-fluid page-body-wrapper full-page-wrapper">
        <div class="row w-100 m-0">
          <div class="content-wrapper full-page-wrapper d-flex align-items-center auth login-bg">
            <div class="card col-lg-4 mx-auto">
              <div class="card-body px-5 py-5">
                <h3 class="card-title text-left mb-3">Register</h3>
                <form action="/" method="post" modelAttribute="AdminRegistration">
                  <div class="form-group">
                    <label>Room Name</label>
                    <input type="text" name= "roomName" class="form-control p_input">
                  </div>
                  <div class="form-group">
                    <label>Full Name</label>
                    <input type="text" name= "fullName" class="form-control p_input">
                  </div>
                  <div class="form-group">
                    <label>Email</label>
                    <input type="email" name= "email"class="form-control p_input">
                  </div>
                   <div class="form-group">
                    <label>Mobile</label>
                    <input type="number" name= "mobile" class="form-control p_input">
                  </div>
                  <div class="form-group">
                    <label>Password</label>
                    <input type="password" name= "password"class="form-control p_input">
                  </div>
                  <div class="form-group">
                    <label>Confirm Password</label>
                    <input type="password" name= "confirmPassword" class="form-control p_input">
                  </div>
                  <div class="text-center">
                    <button type="submit" class="btn btn-primary btn-block enter-btn">Register</button>
                    
                  </div>
                </form>
              </div>
            </div>
          </div>
          <!-- content-wrapper ends -->
        </div>
      </div>
   
    <script src="assets/vendors/js/vendor.bundle.base.js"></script>
    <script src="assets/js/off-canvas.js"></script>
    <script src="assets/js/hoverable-collapse.js"></script>
    <script src="assets/js/misc.js"></script>
    <script src="assets/js/settings.js"></script>
    <script src="assets/js/todolist.js"></script>
    <!-- endinject -->
  </body>


</html>