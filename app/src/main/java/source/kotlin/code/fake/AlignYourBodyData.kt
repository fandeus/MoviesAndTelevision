package source.kotlin.code.fake

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import source.kotlin.code.R

class AlignYourBodyData {
    companion object {
        fun alignYourBodyData() = listOf(
            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),

            AlignYouBody(
                R.drawable.img_profile_picture,
                R.string.app_name
            ),
        )
    }
}

data class AlignYouBody(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)