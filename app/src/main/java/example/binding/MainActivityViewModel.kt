package example.binding

import android.databinding.BaseObservable
import android.databinding.ObservableField

class MainActivityViewModel : BaseObservable() {
    val textValue1 = ObservableField<String>("")
}
