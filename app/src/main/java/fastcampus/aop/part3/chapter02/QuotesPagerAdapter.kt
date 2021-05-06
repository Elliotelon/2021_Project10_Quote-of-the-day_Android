package fastcampus.aop.part3.chapter02

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuotesPagerAdapter(
        private val quotes: List<Quote>
): RecyclerView.Adapter<QuotesPagerAdapter.QuoteViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            QuoteViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(R.layout.item_quote, parent, false)
            )

    override fun getItemCount() = quotes.size

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        holder.bind(quotes[position])
    }

    class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val quoteTextView: TextView = itemView.findViewById(R.id.quoteTextView)
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)

        fun bind(quote: Quote){
            quoteTextView.text = quote.quote
            nameTextView.text = quote.name
        }
    }

}