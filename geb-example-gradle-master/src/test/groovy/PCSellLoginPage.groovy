import geb.Page

class PCSellLoginPage extends Page {
    static at = {
        title.startsWith("PC SELL")
    }

    static content = {
        loginButton { $("input", type: "submit") }
        userid { $("input", name: "userId") }
        password { $("input", name: "password") }
    }
}
