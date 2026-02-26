package com.rashid.saleem.navigationincompose.data.models

import kotlinx.serialization.Serializable

@Serializable
data class PostModel(
    val id: String,
    val title: String,
    val description: String,
    val image: String, // url
) {

    companion object {
        val empty = PostModel(
            id = "-1",
            title = "",
            description = "",
            image = ""
        )
    }
}

val dummyPostsList = mutableListOf(
    PostModel(
        id = "101",
        title = "Exploring the Wonders of the Deep Sea",
        description = "Venture into the mysterious and largely unexplored realm of the deep sea. We'll shine a light on the incredible organisms that thrive under immense pressure and in total darkness, from bioluminescent fish to giant squids. Learn about the technological challenges of deep-sea exploration and the vital ecological role these extreme environments play in planetary health. Discover how scientists are using remotely operated vehicles (ROVs) to uncover secrets hidden miles beneath the surface, revealing new species and geological phenomena. This fascinating ecosystem holds countless secrets waiting to be found.",
        image = "https://images.pexels.com/photos/11181297/pexels-photo-11181297.jpeg" // Relevant: A shark swimming in the deep blue ocean.
    ),
    PostModel(
        id = "102",
        title = "10 Must-Visit Beaches This Summer",
        description = "Sun, sand, and surf await! Planning the perfect summer escape starts here. We've compiled a list of the world's most breathtaking beaches, covering everything from the iconic white sands of the Caribbean to the rugged, dramatic coastlines of the Pacific Northwest. Whether you're seeking a quiet spot for relaxation, excellent surfing waves, or a family-friendly destination, this guide has you covered with travel tips, local cuisine recommendations, and the best times to visit each paradise. Don't forget your sunscreen and snorkel!",
        image = "https://images.pexels.com/photos/1577943/pexels-photo-1577943.jpeg" // Relevant: View of a tropical beach with turquoise water.
    ),
    PostModel(
        id = "103",
        title = "Kotlin vs. Java: A Modern Showdown",
        description = "Dive into the key differences and similarities between two of the most popular languages in the development world: Kotlin and Java. We analyze syntax conciseness, null safety features, interoperability, and compilation speed. For Android developers, we discuss why Google officially endorsed Kotlin, examining how its modern features simplify coding and reduce boilerplate. Understand the pros and cons of migrating existing Java projects to Kotlin and which language is the superior choice for new enterprise and mobile applications in 2024. The future of the JVM ecosystem is evolving!",
        image = "https://images.pexels.com/photos/177598/pexels-photo-177598.jpeg" // Relevant: Close-up of programming code on a monitor.
    ),
    PostModel(
        id = "104",
        title = "Mastering the Art of Home Brewing Coffee",
        description = "Transform your kitchen into a professional-grade cafe and brew coffee like a true barista. This comprehensive guide covers everything from selecting the best beans and understanding grind sizes to mastering popular brewing methods like Pour-Over (Chemex/V60), French Press, and AeroPress. We'll delve into water temperature's crucial role and offer tips on achieving the perfect extraction time for a rich, flavorful cup every morning. Stop settling for average coffee and elevate your daily ritual with these expert techniques and tools.",
        image = "https://images.pexels.com/photos/1879068/pexels-photo-1879068.jpeg" // Relevant: Coffee being poured into a mug.
    ),
    PostModel(
        id = "105",
        title = "Introduction to Jetpack Compose",
        description = "Step into the future of Android UI development with Jetpack Compose. As Google's modern, declarative toolkit, Compose fundamentally changes how developers build interfaces by moving away from XML layouts. We'll walk through the foundational concepts: Composables, State management, and Theming. Learn how this shift simplifies complex UIs, makes them easier to maintain, and accelerates development speed. See code examples illustrating side effects, navigation integration, and testing strategies. Get started with the next generation of beautiful, native Android apps today.",
        image = "https://images.pexels.com/photos/691668/pexels-photo-691668.jpeg" // Relevant: Abstract visualization of digital development/UI.
    ),
    PostModel(
        id = "106",
        title = "Hiking the Grand Canyon: A Detailed Guide",
        description = "Prepare for an unforgettable adventure into one of the world's most majestic natural formations. Our detailed guide to hiking the Grand Canyon covers the best trails for all skill levels, including the popular Bright Angel and South Kaibab trails. We provide essential information on packing lists, water strategies, weather preparedness, and obtaining necessary permits for overnight trips. Safety is paramount, so we emphasize heat management and altitude awareness. Plan your visit to maximize your experience of this breathtaking landscape and its unique geological history. The views are worth the challenge!",
        image = "https://images.pexels.com/photos/236552/pexels-photo-236552.jpeg" // **UPDATED**: Relevant: A panoramic view of the Grand Canyon.
    ),
    PostModel(
        id = "107",
        title = "The Future of Electric Vehicles",
        description = "The electric vehicle (EV) market is accelerating rapidly, fundamentally changing the automotive landscape. This post offers an in-depth analysis of current EV trends, including advancements in battery technology that are increasing range and reducing charging times. We evaluate the growing infrastructure of public charging stations and discuss the regulatory push toward sustainability. Explore how major manufacturers are competing with new models and features, and consider the environmental and economic impact of widespread EV adoption on urban planning and energy grids. The road ahead is electric!",
        image = "https://images.pexels.com/photos/3853159/pexels-photo-3853159.jpeg" // Relevant: Electric car charging at a station.
    ),
    PostModel(
        id = "108",
        title = "Beginner's Guide to Stock Market Investing",
        description = "Taking the first step into investing can seem daunting, but this guide simplifies the stock market for absolute beginners. We break down core concepts like stocks, bonds, mutual funds, and ETFs, explaining risk tolerance and the power of compounding interest. Learn how to open a brokerage account, research potential investments, and formulate a long-term strategy for wealth building. We stress the importance of diversification and dollar-cost averaging to navigate market volatility. Start securing your financial future today with informed, confident decisions.",
        image = "https://images.pexels.com/photos/5926392/pexels-photo-5926392.jpeg" // Relevant: Graph/chart showing stock market movement.
    ),
    PostModel(
        id = "109",
        title = "How to Optimize Your Android App Performance",
        description = "A smooth and fast user experience is crucial for app retention. This technical guide provides developers with practical strategies to significantly boost Android app performance. We cover memory management techniques (reducing leaks), optimizing layout hierarchies (eliminating overdraw), and improving startup times. Learn to profile your app using Android Studio tools like the Profiler to identify and fix bottlenecks in CPU, memory, and network usage. Implement lazy loading and efficient background processing to ensure your application runs flawlessly on all devices.",
        image = "https://images.pexels.com/photos/3861958/pexels-photo-3861958.jpeg" // **UPDATED**: Relevant: A person coding on a laptop.
    ),
    PostModel(
        id = "110",
        title = "Delicious Vegan Recipes for Weeknights",
        description = "Eating plant-based doesn't have to be time-consuming! Discover a collection of quick, easy, and incredibly delicious vegan recipes perfect for busy weeknights. From creamy pasta dishes and hearty lentil stews to vibrant stir-fries, these meals can be prepared in 30 minutes or less. We focus on utilizing affordable, common ingredients and maximizing flavor with spices and fresh herbs. Whether you're fully vegan or just looking to incorporate more meatless Mondays, these recipes provide healthy, satisfying options for the whole family. Enjoy guilt-free dining!",
        image = "https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg" // Relevant: A colorful, healthy plate of vegetables/salad.
    )
)