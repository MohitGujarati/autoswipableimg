import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.autoswipableimg.R

class WalkthroughPagerAdapter(
    private val context: Context,
    private val viewPager: ViewPager2
) : RecyclerView.Adapter<WalkthroughPagerAdapter.ViewHolder>() {

    private val pageImages = intArrayOf(
        R.drawable.ic_android,
        R.drawable.ic_android_blue,
        R.drawable.ic_android_red
    )

    private val textPages = arrayOf(
        "hello ",
        "world",
        "this",
        "fof"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_walkthrough_page, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(pageImages[position])
        holder.textView.text = textPages[position]
        holder.nextButton.setOnClickListener {
            if (position < textPages.size - 1) {
                viewPager.setCurrentItem(position + 1, true)
            } else {
                Toast.makeText(context, "Reached the end!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return pageImages.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textview)
        val nextButton: Button = itemView.findViewById(R.id.nextButton)
    }
}
