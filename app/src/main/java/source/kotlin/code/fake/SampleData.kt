package source.kotlin.code.fake

import source.kotlin.code.Message

class SampleData {
    companion object {
        fun conversationSample(): List<Message> {
            return mutableListOf(
                Message(
                    "Colleague",
                    "Test ... test ... test"
                ),

                Message(
                    "Colleague",
                    "List of Android version " +
                            "\n Android KitKat" +
                            "\n Android Lollipop" +
                            "\n Android Marshmallow" +
                            "\n Android Nougat" +
                            "\n Android Oreo"
                ),

                Message(
                    "Colleague",
                    "iteratively aligning GPT-4 using lessons from our adversarial" +
                            " testing program as well as ChatGPT, resulting in our best-ever " +
                            "results (though far from perfect) on factuality, steerability," +
                            " and refusing to go outside of guardrails."
                ),

                Message(
                    "Colleague",
                    "We’ve created GPT-4, the latest milestone in OpenAI’s " +
                            "effort in scaling up deep learning. "
                ),

                Message(
                    "GPT-3.5’s",
                    "Over the past two years, we rebuilt our entire deep" +
                            " learning stack and, together with Azure"
                ),

                Message(
                    "Colleague",
                    "We are releasing GPT-4’s text input capability via" +
                            " ChatGPT and the API (with a waitlist). "
                ),

                Message(
                    "Capabilities",
                    "In a casual conversation, the distinction between " +
                            "GPT-3.5 and GPT-4 can be subtle. The difference comes " +
                            "out when the complexity of the task reaches a sufficient " +
                            "threshold—GPT-4 is more reliable, creative, and able to handle " +
                            "much more nuanced instructions than GPT-3.5."
                ),

                Message(
                    "Olympiads",
                    "To understand the difference between the two models, we tested on " +
                            "a variety of benchmarks, including simulating exams that were " +
                            "originally designed for humans. We proceeded by using the most " +
                            "recent publicly-available tests (in the case of the Olympiads and " +
                            "AP free response questions) or by purchasing 2022–2023 editions of " +
                            "practice exams. We did no specific training for these exams. " +
                            "A minority of the problems in the exams were seen by the model" +
                            " during training, but we believe the results to be representative—see " +
                            "our technical report for details."
                )
            )
        }
    }
}