package duy.anh.fragmentex.frg

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import duy.anh.fragmentex.NamesAdapter
import duy.anh.fragmentex.R

class FragmentB : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var backButton: Button

    override fun onAttach(context:Context) {
        super.onAttach(context)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        backButton = view.findViewById(R.id.backButton)

        val namesList = listOf("Name 1", "Name 2", "Name 3")
        val namesAdapter = NamesAdapter(namesList)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = namesAdapter

        backButton.setOnClickListener {

            requireActivity().supportFragmentManager.popBackStack()
        }

        return view
    }

    override fun onDetach() {
        super.onDetach()
    }
}