package com.birdview.api_interfaces

import android.net.Uri

interface ImagePickerCallback {
    fun onImagePickerResult(uri: Uri?)
}