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
            "Sunday Funday, the last game released in North America for the 8-bit Nintendo Entertainment System, is about a skateboarding hero who's late for Sunday School.")

    // Methods - actions the object can take
    fun getFact(): String {
        // Randomly select fact
        val randomGenerator = Random()
        val randomNumber = randomGenerator.nextInt(facts.size)
        return facts[randomNumber]
    }
}