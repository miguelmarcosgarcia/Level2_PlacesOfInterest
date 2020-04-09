package com.example.placesofinterest

import androidx.annotation.DrawableRes

/*
* This class will be the data model for each object that will be shown in the RecyclerView.
* The imageResId has been annotated with @DrawableRes which indicated to Android that we expect
* this variable to be an Drawable Resource Id.
*/
data class Place(
    var name: String,
    @DrawableRes var imageResId: Int
) {

    /*
    * In Kotlin arrays are defined using arrayOf() and static types are defined within a
    * companion object.
    * https://kotlinlang.org/docs/tutorials/kotlin-for-py/objects-and-companion-objects.html
    */
    companion object {
        val PLACE_NAMES = arrayOf(
            "Amsterdam Dam",
            "Amsterdam Weesperplein",
            "Rotterdam Euromast",
            "Den Haag Binnenhof",
            "Utrecht Dom",
            "Groningen Martinitoren",
            "Maastricht Vrijthof",
            "New York Vrijheidsbeeld",
            "San Francisco Golden Gate",
            "Yellowstone Old Faithful",
            "Yosemite Half Dome",
            "Washington White House",
            "Ottawa Parliament Hill",
            "Londen Tower Bridge",
            "Brussel Manneken Pis",
            "Berlijn Reichstag",
            "Parijs Eiffeltoren",
            "Barcelona Sagrada Familia",
            "Rome Colosseum",
            "Pompeii",
            "Kopenhagen",
            "Oslo",
            "Stockholm",
            "Helsinki",
            "Moskou Rode Plein",
            "Beijing Verboden Stad",
            "Kaapstad Tafelberg",
            "Rio de Janeiro Copacabana",
            "Sydney Opera",
            "Hawaii Honolulu",
            "Alaska Denali"
        )

        val PLACE_RES_DRAWABLE_IDS = arrayOf(
            R.drawable.amsterdam_dam,
            R.drawable.amsterdam_weesperplein,
            R.drawable.rotterdam_euromast,
            R.drawable.den_haag_binnenhof,
            R.drawable.utrecht_dom,
            R.drawable.groningen_martinitoren,
            R.drawable.maastricht_vrijthof,
            R.drawable.new_york_vrijheidsbeeld,
            R.drawable.san_francisco_golden_gate,
            R.drawable.yellowstone_old_faithful,
            R.drawable.yosemite_half_dome,
            R.drawable.washington_white_house,
            R.drawable.ottawa_parliament_hill,
            R.drawable.london_tower_bridge,
            R.drawable.brussel_manneken_pis,
            R.drawable.berlijn_reichstag,
            R.drawable.parijs_eiffeltoren,
            R.drawable.barcelona_sagrada_familia,
            R.drawable.rome_colosseum,
            R.drawable.pompeii,
            R.drawable.kopenhagen,
            R.drawable.oslo,
            R.drawable.stockholm,
            R.drawable.helsinki,
            R.drawable.moskou_rode_plein,
            R.drawable.beijing_verboden_stad,
            R.drawable.kaapstad_tafelberg,
            R.drawable.rio_de_janeiro_copacabana,
            R.drawable.sydney_opera,
            R.drawable.hawaii,
            R.drawable.alaska_denali
        )
    }
}

