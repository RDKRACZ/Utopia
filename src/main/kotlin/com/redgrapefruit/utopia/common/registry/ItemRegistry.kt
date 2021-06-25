package com.redgrapefruit.utopia.common.registry

import com.redgrapefruit.utopia.common.MOD_ID
import com.redgrapefruit.utopia.common.item.OverdueFoodItem
import com.redgrapefruit.utopia.common.item.RottenFoodItem
import com.redgrapefruit.utopia.common.item.SaltedFoodItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

/**
 * Realism's item registry
 */
@Suppress("MemberVisibilityCanBePrivate")
object ItemRegistry {
    // Rotten food
    val ROTTEN_BEEF_JERKY = RottenFoodItem(ConfigRegistry.BEEF_JERKY)
    val ROTTEN_BEEF_WELLINGTON = RottenFoodItem(ConfigRegistry.BEEF_WELLINGTON)
    val ROTTEN_FRIED_CHICKEN = RottenFoodItem(ConfigRegistry.FRIED_CHICKEN)
    val ROTTEN_LEMON_CHICKEN = RottenFoodItem(ConfigRegistry.LEMON_CHICKEN)

    // Overdue food
    val OVERDUE_ALMOND = OverdueFoodItem(ConfigRegistry.ALMOND)
    val OVERDUE_ALMOND_BRITTLE = OverdueFoodItem(ConfigRegistry.ALMOND_BRITTLE)
    val OVERDUE_APPLE_JUICE = OverdueFoodItem(ConfigRegistry.APPLE_JUICE)
    val OVERDUE_APPLE_PIE = OverdueFoodItem(ConfigRegistry.APPLE_PIE)
    val OVERDUE_APRICOT = OverdueFoodItem(ConfigRegistry.APRICOT)
    val OVERDUE_APRICOT_JAM = OverdueFoodItem(ConfigRegistry.APRICOT_JAM)
    val OVERDUE_ARTICHOKE = OverdueFoodItem(ConfigRegistry.ARTICHOKE)
    val OVERDUE_ARTICHOKE_DIP = OverdueFoodItem(ConfigRegistry.ARTICHOKE_DIP)
    val OVERDUE_ASPARAGUS = OverdueFoodItem(ConfigRegistry.ASPARAGUS)
    val OVERDUE_AVOCADO = OverdueFoodItem(ConfigRegistry.AVOCADO)
    val OVERDUE_BAKED_BEANS = OverdueFoodItem(ConfigRegistry.BAKED_BEANS)
    val OVERDUE_BANANA = OverdueFoodItem(ConfigRegistry.BANANA)
    val OVERDUE_BANANA_CREAM_PIE = OverdueFoodItem(ConfigRegistry.BANANA_CREAM_PIE)
    val OVERDUE_BANANA_NUT_BREAD = OverdueFoodItem(ConfigRegistry.BANANA_NUT_BREAD)
    val OVERDUE_BARLEY = OverdueFoodItem(ConfigRegistry.BARLEY)
    val OVERDUE_BASIL = OverdueFoodItem(ConfigRegistry.BASIL)
    val OVERDUE_BELLPEPPER = OverdueFoodItem(ConfigRegistry.BELLPEPPER)
    val OVERDUE_BLACKBEAN = OverdueFoodItem(ConfigRegistry.BLACKBEAN)
    val OVERDUE_BLACKBERRY = OverdueFoodItem(ConfigRegistry.BLACKBERRY)
    val OVERDUE_BLACKBERRY_JAM = OverdueFoodItem(ConfigRegistry.BLACKBERRY_JAM)
    val OVERDUE_BLT = OverdueFoodItem(ConfigRegistry.BLT)
    val OVERDUE_BLUEBERRY = OverdueFoodItem(ConfigRegistry.BLUEBERRY)
    val OVERDUE_BLUEBERRY_JAM = OverdueFoodItem(ConfigRegistry.BLUEBERRY_JAM)
    val OVERDUE_BROCCOLI = OverdueFoodItem(ConfigRegistry.BROCCOLI)
    val OVERDUE_BROWNIES = OverdueFoodItem(ConfigRegistry.BROWNIES)
    val OVERDUE_BURRITO = OverdueFoodItem(ConfigRegistry.BURRITO)
    val OVERDUE_BUTTER = OverdueFoodItem(ConfigRegistry.BUTTER)
    val OVERDUE_BUTTERED_TOAST = OverdueFoodItem(ConfigRegistry.BUTTERED_TOAST)
    val OVERDUE_CABBAGE = OverdueFoodItem(ConfigRegistry.CABBAGE)
    val OVERDUE_CAESAR_SALAD = OverdueFoodItem(ConfigRegistry.CAESAR_SALAD)
    val OVERDUE_CANDIED_NUTS = OverdueFoodItem(ConfigRegistry.CANDIED_NUTS)
    val OVERDUE_CANDY_CORN = OverdueFoodItem(ConfigRegistry.CANDY_CORN)
    val OVERDUE_CARAMEL = OverdueFoodItem(ConfigRegistry.CARAMEL)
    val OVERDUE_CANTALOUPE = OverdueFoodItem(ConfigRegistry.CANTALOUPE)
    val OVERDUE_CARNITAS = OverdueFoodItem(ConfigRegistry.CARNITAS)
    val OVERDUE_CASHEW = OverdueFoodItem(ConfigRegistry.CASHEW)
    val OVERDUE_CASHEW_CHICKEN = OverdueFoodItem(ConfigRegistry.CASHEW_CHICKEN)
    val OVERDUE_CAULIFLOWER = OverdueFoodItem(ConfigRegistry.CAULIFLOWER)
    val OVERDUE_CELERY = OverdueFoodItem(ConfigRegistry.CELERY)
    val OVERDUE_CHEESE = OverdueFoodItem(ConfigRegistry.CHEESE)
    val OVERDUE_CHEESE_CAKE = OverdueFoodItem(ConfigRegistry.CHEESE_CAKE)
    val OVERDUE_CHEESE_PIZZA = OverdueFoodItem(ConfigRegistry.CHEESE_PIZZA)
    val OVERDUE_CHEESEBURGER = OverdueFoodItem(ConfigRegistry.CHEESEBURGER)
    val OVERDUE_CHERRY = OverdueFoodItem(ConfigRegistry.CHERRY)
    val OVERDUE_CHERRY_JAM = OverdueFoodItem(ConfigRegistry.CHERRY_JAM)
    val OVERDUE_CHERRY_PIE = OverdueFoodItem(ConfigRegistry.CHERRY_PIE)
    val OVERDUE_CHICKEN_AND_DUMPLINGS = OverdueFoodItem(ConfigRegistry.CHICKEN_AND_DUMPLINGS)
    val OVERDUE_CHICKEN_AND_NOODLES = OverdueFoodItem(ConfigRegistry.CHICKEN_AND_NOODLES)
    val OVERDUE_CHICKEN_AND_RICE = OverdueFoodItem(ConfigRegistry.CHICKEN_AND_RICE)
    val OVERDUE_CHILE_PEPPER = OverdueFoodItem(ConfigRegistry.CHILE_PEPPER)
    val OVERDUE_CHILI_RELLENO = OverdueFoodItem(ConfigRegistry.CHILI_RELLENO)
    val OVERDUE_CHIMICHANGA = OverdueFoodItem(ConfigRegistry.CHIMICHANGA)
    val OVERDUE_CHIVES = OverdueFoodItem(ConfigRegistry.CHIVES)
    val OVERDUE_CHOCOLATE = OverdueFoodItem(ConfigRegistry.CHOCOLATE)
    val OVERDUE_CHOCOLATE_MILKSHAKE = OverdueFoodItem(ConfigRegistry.CHOCOLATE_MILKSHAKE)
    val OVERDUE_CINNAMON = OverdueFoodItem(ConfigRegistry.CINNAMON)
    val OVERDUE_COCONUT = OverdueFoodItem(ConfigRegistry.COCONUT)
    val OVERDUE_COFFEE = OverdueFoodItem(ConfigRegistry.COFFEE)
    val OVERDUE_COFFEE_BEANS = OverdueFoodItem(ConfigRegistry.COFFEE_BEANS)
    val OVERDUE_CORN = OverdueFoodItem(ConfigRegistry.CORN)
    val OVERDUE_CORNISH_PASTY = OverdueFoodItem(ConfigRegistry.CORNISH_PASTY)
    val OVERDUE_CRANBERRY = OverdueFoodItem(ConfigRegistry.CRANBERRY)
    val OVERDUE_CRANBERRY_JUICE = OverdueFoodItem(ConfigRegistry.CRANBERRY_JUICE)
    val OVERDUE_CREMA = OverdueFoodItem(ConfigRegistry.CREMA)
    val OVERDUE_CUCUMBER = OverdueFoodItem(ConfigRegistry.CUCUMBER)
    val OVERDUE_CUCUMBER_SALAD = OverdueFoodItem(ConfigRegistry.CUCUMBER_SALAD)
    val OVERDUE_CURRANT = OverdueFoodItem(ConfigRegistry.CURRANT)
    val OVERDUE_DATE = OverdueFoodItem(ConfigRegistry.DATE)
    val OVERDUE_DOUGH = OverdueFoodItem(ConfigRegistry.DOUGH)
    val OVERDUE_DOUGHNUT = OverdueFoodItem(ConfigRegistry.DOUGHNUT)
    val OVERDUE_DRAGONFRUIT = OverdueFoodItem(ConfigRegistry.DRAGONFRUIT)
    val OVERDUE_EGG_ROLL = OverdueFoodItem(ConfigRegistry.EGG_ROLL)
    val OVERDUE_EGGPLANT = OverdueFoodItem(ConfigRegistry.EGGPLANT)
    val OVERDUE_ELDERBERRY = OverdueFoodItem(ConfigRegistry.ELDERBERRY)
    val OVERDUE_ELDERBERRY_JAM = OverdueFoodItem(ConfigRegistry.ELDERBERRY_JAM)
    val OVERDUE_ENCHILADA = OverdueFoodItem(ConfigRegistry.ENCHILADA)
    val OVERDUE_ETON_MESS = OverdueFoodItem(ConfigRegistry.ETON_MESS)
    val OVERDUE_FAJITAS = OverdueFoodItem(ConfigRegistry.FAJITAS)
    val OVERDUE_FIG = OverdueFoodItem(ConfigRegistry.FIG)
    val OVERDUE_FIGGY_PUDDING = OverdueFoodItem(ConfigRegistry.FIGGY_PUDDING)
    val OVERDUE_FISH_AND_CHIPS = OverdueFoodItem(ConfigRegistry.FISH_AND_CHIPS)
    val OVERDUE_FLOUR = OverdueFoodItem(ConfigRegistry.FLOUR)
    val OVERDUE_FRENCH_FRIES = OverdueFoodItem(ConfigRegistry.FRENCH_FRIES)
    val OVERDUE_FRUIT_SALAD = OverdueFoodItem(ConfigRegistry.FRUIT_SALAD)
    val OVERDUE_FRUIT_SMOOTHIE = OverdueFoodItem(ConfigRegistry.FRUIT_SMOOTHIE)
    val OVERDUE_GARLIC = OverdueFoodItem(ConfigRegistry.GARLIC)
    val OVERDUE_GINGER = OverdueFoodItem(ConfigRegistry.GINGER)
    val OVERDUE_GRAPE = OverdueFoodItem(ConfigRegistry.GRAPE)
    val OVERDUE_GRAPE_JAM = OverdueFoodItem(ConfigRegistry.GRAPE_JAM)
    val OVERDUE_GRAPEFRUIT = OverdueFoodItem(ConfigRegistry.GRAPEFRUIT)
    val OVERDUE_GREENBEAN = OverdueFoodItem(ConfigRegistry.GREENBEAN)
    val OVERDUE_GREENONION = OverdueFoodItem(ConfigRegistry.GREENONION)
    val OVERDUE_GRILLED_CHEESE = OverdueFoodItem(ConfigRegistry.GRILLED_CHEESE)
    val OVERDUE_HAM_SANDWICH = OverdueFoodItem(ConfigRegistry.HAM_SANDWICH)
    val OVERDUE_HAMBURGER = OverdueFoodItem(ConfigRegistry.HAMBURGER)
    val OVERDUE_HOPS = OverdueFoodItem(ConfigRegistry.HOPS)
    val OVERDUE_HORCHATA = OverdueFoodItem(ConfigRegistry.HORCHATA)
    val OVERDUE_KALE = OverdueFoodItem(ConfigRegistry.KALE)
    val OVERDUE_KALE_CHIPS = OverdueFoodItem(ConfigRegistry.KALE_CHIPS)
    val OVERDUE_KALE_SMOOTHIE = OverdueFoodItem(ConfigRegistry.KALE_SMOOTHIE)
    val OVERDUE_KIWI = OverdueFoodItem(ConfigRegistry.KIWI)
    val OVERDUE_KUMQUAT = OverdueFoodItem(ConfigRegistry.KUMQUAT)
    val OVERDUE_LEAFY_SALAD = OverdueFoodItem(ConfigRegistry.LEAFY_SALAD)
    val OVERDUE_LEEK = OverdueFoodItem(ConfigRegistry.LEEK)
    val OVERDUE_LEEK_SOUP = OverdueFoodItem(ConfigRegistry.LEEK_SOUP)
    val OVERDUE_LEMON = OverdueFoodItem(ConfigRegistry.LEMON)
    val OVERDUE_LEMONADE = OverdueFoodItem(ConfigRegistry.LEMONADE)

    // Salted food
    val SALTED_ALMOND = SaltedFoodItem(ConfigRegistry.ALMOND)
    val SALTED_ALMOND_BRITTLE = SaltedFoodItem(ConfigRegistry.ALMOND_BRITTLE)
    val SALTED_APRICOT = SaltedFoodItem(ConfigRegistry.APRICOT)
    val SALTED_ARTICHOKE = SaltedFoodItem(ConfigRegistry.ARTICHOKE)
    val SALTED_ARTICHOKE_DIP = SaltedFoodItem(ConfigRegistry.ARTICHOKE_DIP)
    val SALTED_ASPARAGUS = SaltedFoodItem(ConfigRegistry.ASPARAGUS)
    val SALTED_AVOCADO = SaltedFoodItem(ConfigRegistry.AVOCADO)
    val SALTED_BAKED_BEANS = SaltedFoodItem(ConfigRegistry.BAKED_BEANS)
    val SALTED_BANANA_NUT_BREAD = SaltedFoodItem(ConfigRegistry.BANANA_NUT_BREAD)
    val SALTED_BASIL = SaltedFoodItem(ConfigRegistry.BASIL)
    val SALTED_BEEF_JERKY = SaltedFoodItem(ConfigRegistry.BEEF_JERKY)
    val SALTED_BEEF_WELLINGTON = SaltedFoodItem(ConfigRegistry.BEEF_WELLINGTON)
    val SALTED_BLACKBEAN = SaltedFoodItem(ConfigRegistry.BLACKBEAN)
    val SALTED_BROCCOLI = SaltedFoodItem(ConfigRegistry.BROCCOLI)
    val SALTED_CABBAGE = SaltedFoodItem(ConfigRegistry.CABBAGE)
    val SALTED_CAESAR_SALAD = SaltedFoodItem(ConfigRegistry.CAESAR_SALAD)
    val SALTED_CANTALOUPE = SaltedFoodItem(ConfigRegistry.CANTALOUPE)
    val SALTED_CARNITAS = SaltedFoodItem(ConfigRegistry.CARNITAS)
    val SALTED_CASHEW = SaltedFoodItem(ConfigRegistry.CASHEW)
    val SALTED_CASHEW_CHICKEN = SaltedFoodItem(ConfigRegistry.CASHEW_CHICKEN)
    val SALTED_CAULIFLOWER = SaltedFoodItem(ConfigRegistry.CAULIFLOWER)
    val SALTED_CELERY = SaltedFoodItem(ConfigRegistry.CELERY)
    val SALTED_CHICKEN_AND_DUMPLINGS = SaltedFoodItem(ConfigRegistry.CHICKEN_AND_DUMPLINGS)
    val SALTED_CHICKEN_AND_NOODLES = SaltedFoodItem(ConfigRegistry.CHICKEN_AND_NOODLES)
    val SALTED_CHICKEN_AND_RICE = SaltedFoodItem(ConfigRegistry.CHICKEN_AND_RICE)
    val SALTED_CHIMICHANGA = SaltedFoodItem(ConfigRegistry.CHIMICHANGA)
    val SALTED_CORN = SaltedFoodItem(ConfigRegistry.CORN)
    val SALTED_CREMA = SaltedFoodItem(ConfigRegistry.CREMA)
    val SALTED_CUCUMBER = SaltedFoodItem(ConfigRegistry.CUCUMBER)
    val SALTED_CUCUMBER_SALAD = SaltedFoodItem(ConfigRegistry.CUCUMBER_SALAD)
    val SALTED_EGG_ROLL = SaltedFoodItem(ConfigRegistry.EGG_ROLL)
    val SALTED_EGGPLANT = SaltedFoodItem(ConfigRegistry.EGGPLANT)
    val SALTED_FIG = SaltedFoodItem(ConfigRegistry.FIG)
    val SALTED_FISH_AND_CHIPS = SaltedFoodItem(ConfigRegistry.FISH_AND_CHIPS)
    val SALTED_FRENCH_FRIES = SaltedFoodItem(ConfigRegistry.FRENCH_FRIES)
    val SALTED_FRIED_CHICKEN = SaltedFoodItem(ConfigRegistry.FRIED_CHICKEN)
    val SALTED_GARLIC = SaltedFoodItem(ConfigRegistry.GARLIC)
    val SALTED_GREENBEAN = SaltedFoodItem(ConfigRegistry.GREENBEAN)
    val SALTED_KALE = SaltedFoodItem(ConfigRegistry.KALE)
    val SALTED_KALE_CHIPS = SaltedFoodItem(ConfigRegistry.KALE_CHIPS)
    val SALTED_KUMQUAT = SaltedFoodItem(ConfigRegistry.KUMQUAT)
    val SALTED_LEAFY_SALAD = SaltedFoodItem(ConfigRegistry.LEAFY_SALAD)
    val SALTED_LEEK = SaltedFoodItem(ConfigRegistry.LEEK)
    val SALTED_LEEK_SOUP = SaltedFoodItem(ConfigRegistry.LEEK_SOUP)

    // Fresh food

    fun run() {
        register("rotten_beef_jerky", ROTTEN_BEEF_JERKY)
        register("rotten_beef_wellington", ROTTEN_BEEF_WELLINGTON)
        register("rotten_fried_chicken", ROTTEN_FRIED_CHICKEN)
        register("rotten_lemon_chicken", ROTTEN_LEMON_CHICKEN)
        register("overdue_almond", OVERDUE_ALMOND)
        register("overdue_almond_brittle", OVERDUE_ALMOND_BRITTLE)
        register("overdue_apple_juice", OVERDUE_APPLE_JUICE)
        register("overdue_apple_pie", OVERDUE_APPLE_PIE)
        register("overdue_apricot", OVERDUE_APRICOT)
        register("overdue_apricot_jam", OVERDUE_APRICOT_JAM)
        register("overdue_artichoke", OVERDUE_ARTICHOKE)
        register("overdue_artichoke_dip", OVERDUE_ARTICHOKE_DIP)
        register("overdue_asparagus", OVERDUE_ASPARAGUS)
        register("overdue_avocado", OVERDUE_AVOCADO)
        register("overdue_baked_beans", OVERDUE_BAKED_BEANS)
        register("overdue_banana", OVERDUE_BANANA)
        register("overdue_banana_cream_pie", OVERDUE_BANANA_CREAM_PIE)
        register("overdue_banana_nut_bread", OVERDUE_BANANA_NUT_BREAD)
        register("overdue_barley", OVERDUE_BARLEY)
        register("overdue_basil", OVERDUE_BASIL)
        register("overdue_bellpepper", OVERDUE_BELLPEPPER)
        register("overdue_blackbean", OVERDUE_BLACKBEAN)
        register("overdue_blackberry", OVERDUE_BLACKBERRY)
        register("overdue_blackberry_jam", OVERDUE_BLACKBERRY_JAM)
        register("overdue_blt", OVERDUE_BLT)
        register("overdue_blueberry", OVERDUE_BLUEBERRY)
        register("overdue_blueberry_jam", OVERDUE_BLUEBERRY_JAM)
        register("overdue_broccoli", OVERDUE_BROCCOLI)
        register("overdue_brownies", OVERDUE_BROWNIES)
        register("overdue_burrito", OVERDUE_BURRITO)
        register("overdue_butter", OVERDUE_BUTTER)
        register("overdue_buttered_toast", OVERDUE_BUTTERED_TOAST)
        register("overdue_cabbage", OVERDUE_CABBAGE)
        register("overdue_caesar_salad", OVERDUE_CAESAR_SALAD)
        register("overdue_candied_nuts", OVERDUE_CANDIED_NUTS)
        register("overdue_candy_corn", OVERDUE_CANDY_CORN)
        register("overdue_caramel", OVERDUE_CARAMEL)
        register("overdue_cantaloupe", OVERDUE_CANTALOUPE)
        register("overdue_carnitas", OVERDUE_CARNITAS)
        register("overdue_cashew", OVERDUE_CASHEW)
        register("overdue_cashew_chicken", OVERDUE_CASHEW_CHICKEN)
        register("overdue_cauliflower", OVERDUE_CAULIFLOWER)
        register("overdue_celery", OVERDUE_CELERY)
        register("overdue_cheese", OVERDUE_CHEESE)
        register("overdue_cheese_cake", OVERDUE_CHEESE_CAKE)
        register("overdue_cheese_pizza", OVERDUE_CHEESE_PIZZA)
        register("overdue_cheeseburger", OVERDUE_CHEESEBURGER)
        register("overdue_cherry", OVERDUE_CHERRY)
        register("overdue_cherry_jam", OVERDUE_CHERRY_JAM)
        register("overdue_cherry_pie", OVERDUE_CHERRY_PIE)
        register("overdue_chicken_and_dumplings", OVERDUE_CHICKEN_AND_DUMPLINGS)
        register("overdue_chicken_and_noodles", OVERDUE_CHICKEN_AND_NOODLES)
        register("overdue_chicken_and_rice", OVERDUE_CHICKEN_AND_RICE)
        register("overdue_chile_pepper", OVERDUE_CHILE_PEPPER)
        register("overdue_chili_relleno", OVERDUE_CHILI_RELLENO)
        register("overdue_chimichanga", OVERDUE_CHIMICHANGA)
        register("overdue_chives", OVERDUE_CHIVES)
        register("overdue_chocolate", OVERDUE_CHOCOLATE)
        register("overdue_chocolate_milkshake", OVERDUE_CHOCOLATE_MILKSHAKE)
        register("overdue_cinnamon", OVERDUE_CINNAMON)
        register("overdue_coconut", OVERDUE_COCONUT)
        register("overdue_coffee", OVERDUE_COFFEE)
        register("overdue_coffee_beans", OVERDUE_COFFEE_BEANS)
        register("overdue_corn", OVERDUE_CORN)
        register("overdue_cornish_pasty", OVERDUE_CORNISH_PASTY)
        register("overdue_cranberry", OVERDUE_CRANBERRY)
        register("overdue_cranberry_juice", OVERDUE_CRANBERRY_JUICE)
        register("overdue_crema", OVERDUE_CREMA)
        register("overdue_cucumber", OVERDUE_CUCUMBER)
        register("overdue_cucumber_salad", OVERDUE_CUCUMBER_SALAD)
        register("overdue_currant", OVERDUE_CURRANT)
        register("overdue_date", OVERDUE_DATE)
        register("overdue_dough", OVERDUE_DOUGH)
        register("overdue_doughnut", OVERDUE_DOUGHNUT)
        register("overdue_dragonfruit", OVERDUE_DRAGONFRUIT)
        register("overdue_egg_roll", OVERDUE_EGG_ROLL)
        register("overdue_eggplant", OVERDUE_EGGPLANT)
        register("overdue_elderberry", OVERDUE_ELDERBERRY)
        register("overdue_elderberry_jam", OVERDUE_ELDERBERRY_JAM)
        register("overdue_enchilada", OVERDUE_ENCHILADA)
        register("overdue_eton_mess", OVERDUE_ETON_MESS)
        register("overdue_fajitas", OVERDUE_FAJITAS)
        register("overdue_fig", OVERDUE_FIG)
        register("overdue_figgy_pudding", OVERDUE_FIGGY_PUDDING)
        register("overdue_fish_and_chips", OVERDUE_FISH_AND_CHIPS)
        register("overdue_flour", OVERDUE_FLOUR)
        register("overdue_french_fries", OVERDUE_FRENCH_FRIES)
        register("overdue_fruit_salad", OVERDUE_FRUIT_SALAD)
        register("overdue_fruit_smoothie", OVERDUE_FRUIT_SMOOTHIE)
        register("overdue_garlic", OVERDUE_GARLIC)
        register("overdue_ginger", OVERDUE_GINGER)
        register("overdue_grape", OVERDUE_GRAPE)
        register("overdue_grape_jam", OVERDUE_GRAPE_JAM)
        register("overdue_grapefruit", OVERDUE_GRAPEFRUIT)
        register("overdue_greenbean", OVERDUE_GREENBEAN)
        register("overdue_greenonion", OVERDUE_GREENONION)
        register("overdue_grilled_cheese", OVERDUE_GRILLED_CHEESE)
        register("overdue_ham_sandwich", OVERDUE_HAM_SANDWICH)
        register("overdue_hamburger", OVERDUE_HAMBURGER)
        register("overdue_hops", OVERDUE_HOPS)
        register("overdue_horchata", OVERDUE_HORCHATA)
        register("overdue_kale", OVERDUE_KALE)
        register("overdue_kale_chips", OVERDUE_KALE_CHIPS)
        register("overdue_kale_smoothie", OVERDUE_KALE_SMOOTHIE)
        register("overdue_kiwi", OVERDUE_KIWI)
        register("overdue_kumquat", OVERDUE_KUMQUAT)
        register("overdue_leafy_salad", OVERDUE_LEAFY_SALAD)
        register("overdue_leek", OVERDUE_LEEK)
        register("overdue_leek_soup", OVERDUE_LEEK_SOUP)
        register("overdue_lemon", OVERDUE_LEMON)
        register("overdue_lemonade", OVERDUE_LEMONADE)
        register("salted_almond", SALTED_ALMOND)
        register("salted_almond_brittle", SALTED_ALMOND_BRITTLE)
        register("salted_apricot", SALTED_APRICOT)
        register("salted_artichoke", SALTED_ARTICHOKE)
        register("salted_artichoke_dip", SALTED_ARTICHOKE_DIP)
        register("salted_asparagus", SALTED_ASPARAGUS)
        register("salted_avocado", SALTED_AVOCADO)
        register("salted_baked_beans", SALTED_BAKED_BEANS)
        register("salted_banana_nut_bread", SALTED_BANANA_NUT_BREAD)
        register("salted_basil", SALTED_BASIL)
        register("salted_beef_jerky", SALTED_BEEF_JERKY)
        register("salted_beef_wellington", SALTED_BEEF_WELLINGTON)
        register("salted_blackbean", SALTED_BLACKBEAN)
        register("salted_broccoli", SALTED_BROCCOLI)
        register("salted_cabbage", SALTED_CABBAGE)
        register("salted_caesar_salad", SALTED_CAESAR_SALAD)
        register("salted_cantaloupe", SALTED_CANTALOUPE)
        register("salted_carnitas", SALTED_CARNITAS)
        register("salted_cashew", SALTED_CASHEW)
        register("salted_cashew_chicken", SALTED_CASHEW_CHICKEN)
        register("salted_cauliflower", SALTED_CAULIFLOWER)
        register("salted_celery", SALTED_CELERY)
        register("salted_chicken_and_dumplings", SALTED_CHICKEN_AND_DUMPLINGS)
        register("salted_chicken_and_noodles", SALTED_CHICKEN_AND_NOODLES)
        register("salted_chicken_and_rice", SALTED_CHICKEN_AND_RICE)
        register("salted_chimichanga", SALTED_CHIMICHANGA)
        register("salted_corn", SALTED_CORN)
        register("salted_crema", SALTED_CREMA)
        register("salted_cucumber", SALTED_CUCUMBER)
        register("salted_cucumber_salad", SALTED_CUCUMBER_SALAD)
        register("salted_egg_roll", SALTED_EGG_ROLL)
        register("salted_eggplant", SALTED_EGGPLANT)
        register("salted_fig", SALTED_FIG)
        register("salted_fish_and_chips", SALTED_FISH_AND_CHIPS)
        register("salted_french_fries", SALTED_FRENCH_FRIES)
        register("salted_fried_chicken", SALTED_FRIED_CHICKEN)
        register("salted_garlic", SALTED_GARLIC)
        register("salted_greenbean", SALTED_GREENBEAN)
        register("salted_kale", SALTED_KALE)
        register("salted_kale_chips", SALTED_KALE_CHIPS)
        register("salted_kumquat", SALTED_KUMQUAT)
        register("salted_leafy_salad", SALTED_LEAFY_SALAD)
        register("salted_leek", SALTED_LEEK)
        register("salted_leek_soup", SALTED_LEEK_SOUP)
    }

    /**
     * Registers an item to Minecraft
     * @param name Item name
     * @param item Registered item
     */
    private fun register(name: String, item: Item) {
        Registry.register(Registry.ITEM, Identifier(MOD_ID, name), item)
    }
}