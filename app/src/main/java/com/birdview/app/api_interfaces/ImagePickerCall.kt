package com.birdview.app.api_interfaces

import android.net.Uri

interface ImagePickerCallback {
    fun onImagePickerResult(uri: Uri?)
}