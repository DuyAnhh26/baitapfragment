package duy.anh.fragmentex.frg

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import duy.anh.fragmentex.R

class FragmentA : Fragment() {

    private lateinit var editTextName: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonViewDetails: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        editTextName = view.findViewById(R.id.editTextName)
        buttonSave = view.findViewById(R.id.buttonSave)
        buttonViewDetails = view.findViewById(R.id.buttonViewDetails)

        buttonSave.setOnClickListener {
            editTextName.text.toString()
            val fragmentB = FragmentB()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragmentB)
                .addToBackStack(null)
                .commit()
        }

        buttonViewDetails.setOnClickListener {

        }

        return view
    }

    override fun onDetach() {
        super.onDetach()

    }
}