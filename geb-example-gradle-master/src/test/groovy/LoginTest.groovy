import geb.Page

public class LoginTest extends Page {
    static url = "/user/loginForm"
    static at = { title.startsWith("PC") }

    static content = {
        largetext {$("h1")}
        idInput { $("#userId") }
        passwordInput { $("#password") }
        loginBtn { $("#btnLogin") }
    }

    def loginAsTester() {
        idInput = "test1"
        passwordInput = "1"
        loginBtn.click()
    }
}
