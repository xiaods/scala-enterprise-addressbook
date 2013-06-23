package com.xiaods.addressbook

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends EnterpriseAddressbookStack {

  get("/") {
    <html>
      <body>
        <h1>Welcome! Enterprise AddressBook Service</h1>
        Say <a href="hello-scalate">Hello Scalate</a>.
      </body>
    </html>
  }
  
}
