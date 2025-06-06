import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R

class TextAdapter(private val itemList: List<String>) : RecyclerView.Adapter<TextAdapter.TextViewHolder>() {

    class TextViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textItem: TextView = view.findViewById(R.id.textItem)
    }

    override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): TextViewHolder {
        val  view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_text, parent, false)
        return TextViewHolder(view)
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.textItem.text = itemList[position]
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}