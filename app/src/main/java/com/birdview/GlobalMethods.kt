package com.birdview

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.ByteArrayOutputStream

class GlobalMethods {
    companion object{

        public fun encodeImage(bm: Bitmap): String? {
            val baos = ByteArrayOutputStream()
            bm.compress(Bitmap.CompressFormat.JPEG, 100, baos)
            val b = baos.toByteArray()
            return android.util.Base64.encodeToString(b, android.util.Base64.DEFAULT)
        }

        public fun decodeImage(base64String : String?): Bitmap {
            //Toast.makeText(applicationContext, "Decoding", Toast.LENGTH_SHORT).show()
            val imageBytes = android.util.Base64.decode(base64String, android.util.Base64.DEFAULT)
            val decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
            return decodedImage
        }
    }
}