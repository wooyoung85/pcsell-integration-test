import geb.spock.GebSpec

class GebishOrgSpec extends GebSpec {

    def "can get to the current Book of Geb"() {
        when:
        to PcSellHomePage

        then:
        manualsMenu.jumbo.text().startsWith("임직원")

        when:
        manualsMenu.menus[1].click()

        then:
        at PCSellLoginPage
    }

    def "go login page"() {
        when:
        to PcSellHomePage

        then:
        manualsMenu.jumbo.text().startsWith("임직원")

        when:
        manualsMenu.menus[2].click()

        then:
        at PCSellLoginPage
    }

    def "Login Test"() {
        when:
        to LoginTest
        

        then:
        loginBtn.text().startsWith("Login")

        when:
        loginAsTester()

        then:
        at PCSellLoginPage
    }
}