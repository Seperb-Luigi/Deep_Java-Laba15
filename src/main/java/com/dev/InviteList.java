package com.dev;

//Відувається зустріч банкірів на семінар, ми створюємо список запршень

public class InviteList {
    public static void main(String[] args) {
        СonferenceHolder store = new СonferenceHolder("RiverMoll. 2nd floor" );

        ClerksInfo clerksInfo1 = new ClerksInfo("Oleh", "Gorohovskiy", "SEO", 10, "Monobank");
        ClerksInfo clerksInfo2 = new ClerksInfo("Bunya ", "Kolomoiskyy ", "ex", 30, "PrivatBank");
        ClerksInfo clerksInfo3 = new ClerksInfo("Vasyl", "Holoborodko", "Prusident (ex)", 0, "KidalovoBank");
        ClerksInfo clerksInfo4 = new ClerksInfo("Carl", "Grinberg ", "Clerk", 7, "IndonesiaBank");
        ClerksInfo clerksInfo5 = new ClerksInfo("Kizito", "Kizano", "CTO", 3, "SafariAfrika");


        store.addGuest(clerksInfo1);
        store.addGuest(clerksInfo2);
        store.addGuest(clerksInfo3);
        store.addGuest(clerksInfo4);
        store.addGuest(clerksInfo5);

        store.displayAllGuest();

        store.searchGuestByBank("monobank");
    }
}