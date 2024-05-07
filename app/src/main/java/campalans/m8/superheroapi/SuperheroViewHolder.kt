package campalans.m8.superheroapi

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import campalans.m8.superheroapi.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view){

    private val binding=ItemSuperheroBinding.bind(view)

    fun bind(superheroItemResponse: SuperheroItemResponse,onItemSelected:(String)->Unit){
        binding.tvSuperheroName.text = superheroItemResponse.superheroName
        Picasso.get().load(superheroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener{onItemSelected(superheroItemResponse.superheroId)}
    }

}