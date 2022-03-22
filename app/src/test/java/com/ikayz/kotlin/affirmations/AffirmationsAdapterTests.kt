package com.ikayz.kotlin.affirmations

import android.content.Context
import com.ikayz.kotlin.affirmations.model.Affirmation
import org.junit.Test
import org.mockito.MockedConstruction
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
    }
}