package com.bodiewebdesign.funfacts

import java.util.*

class FactBook {
    // Properties - characteristics of the object
    val facts = arrayOf(
            "Black Cat Appreciation Day is August 17.",
            "In January 2005, Richard Hamilton of the Detroit Pistons became the first player in NBA history to lead his team in scoring in a game without making a field goal, scoring 14 points.",
            "The first known indoor billiard table was owned by King Louis XI of France.",
            "News anchor Peter Jennings only lasted in school until the 10th grade.",
            "The decision as to which of the Wright Brothers would make the first powered flight was decided by a coin flip.  Wilbur won.",
            "Under most favorable circumstances, total solar eclipses can last for more than seven minutes.",
            "The Sahara Desert covers 3.5 million square miles, about 31 percent of the continent of Africa.",
            "The association between baseball and hot dogs began as early as 1893 with a German immigrant who owned the St. Louis Browns (now the St. Louis Cardinals) and an amusement park.",
            "The music group Collective Soul is named from a phrase used in Ayn Rand's The Fountainhead.",
            "Sunday Funday, the last game released in North America for the 8-bit Nintendo Entertainment System, is about a skateboarding hero who's late for Sunday School.",
            "The Puritans believed that witches could shape-shift into black cats and even spy on them. England’s King Charles I was arrested and charged with high treason shortly after his treasured black cat passed away, which he believed gave him luck.",
            "In Mexico, a popular variation of 8 Ball called “Last Pocket” requires the player to sink the 8 Ball in the same pocket as where the last ball made prior was pocketed.",
            "Shizouka Meat Producers for the All-Japan Bread Association, made a hot hog measuring 197 feet and resting within a 198 foot bun.  It was made to celebrate the Association’s 50th Anniversary on August 4, 2006 as the Akasaka Prince Hotel in Tokyo, Japan.",
            "Modern air conditioning is said to have been invented by Willis Carrier, the founder of Carrier Corporation, inventing his first unit in 1902.",
            "National Taco Day in America is October 4.",
            "Stanford University was originally named Leland Stanford University, a namesake for founder Leland Stanford’s child, who died of typhoid fever as a teenager.",
            "If you could take a penny on the first day, double it the next day, and then double that amount and repeat the process until 30 days go by, you would have $5,368,709.12",
            "The soft green substance found in the body cavity of lobsters is known as tomalley.",
            "The Addax, a type of large white antelope, and the Dorcas Gazelle, can live their entire lives without drinking water, getting moisture from their food and dew that condenses on plants.",
            "Marlon Brando was allegedly expelled from high school for riding a motorcycle through the halls")

    // Methods - actions the object can take
    fun getFact(): String {
        // Randomly select fact
        val randomGenerator = Random()
        val randomNumber = randomGenerator.nextInt(facts.size)
        return facts[randomNumber]
    }
}