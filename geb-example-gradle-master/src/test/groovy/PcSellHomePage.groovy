import geb.Page

class PcSellHomePage extends Page {

    static at = { title.startsWith("PC") }

    static content = {
        manualsMenu { module(ManualsMenuModule) }
    }
}
