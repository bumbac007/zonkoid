package eu.urbancoders.zonkysniper.investor;

/**
 * Author: Ondrej Steger (ondrej@steger.cz)
 * Date: 16.08.2016
 */

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import eu.urbancoders.zonkysniper.Constants;
import eu.urbancoders.zonkysniper.R;
import eu.urbancoders.zonkysniper.dataobjects.Loan;
import eu.urbancoders.zonkysniper.dataobjects.Message;
import eu.urbancoders.zonkysniper.dataobjects.Rating;
import eu.urbancoders.zonkysniper.integration.ZonkyClient;

import java.text.DecimalFormat;
import java.util.List;

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.MessagesViewHolder> {

    private List<Message> messagesList;
    private Context context;

    public class MessagesViewHolder extends RecyclerView.ViewHolder {
        public TextView date, text;

        public MessagesViewHolder(View view) {
            super(view);
//            header = (TextView) view.findViewById(R.id.header);
//            interestRate = (TextView) view.findViewById(R.id.interestRate);
//            name = (TextView) view.findViewById(R.id.name);
//            invested = (TextView) view.findViewById(R.id.invested);
//            storyImage = (ImageView) view.findViewById(R.id.storyImage);
        }
    }


    public MessagesAdapter(Context context, List<Message> messagesList) {
        this.messagesList = messagesList;
        this.context = context;
    }

    @Override
    public MessagesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.loans_list_row, parent, false);

        return new MessagesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MessagesViewHolder holder, int position) {
        Message message = messagesList.get(position);
//        holder.header.setText(Constants.FORMAT_NUMBER_NO_DECIMALS.format(loan.getAmount()) + " Kč na "
//                + loan.getTermInMonths() + " měsíců");
//        holder.header.setTextColor(Color.parseColor(Rating.getColor(loan.getRating())));

//        // nazev pujcky
//        holder.name.setText(loan.getName());
//
//        // vybarvena urokova sazba
//        holder.interestRate.setText(Rating.getDesc(loan.getRating()) + " | " + new DecimalFormat("#.##").format(loan.getInterestRate() * 100) + "%");
//        holder.interestRate.setTextColor(Color.parseColor(Rating.getColor(loan.getRating())));
//
//        // zainvestováno?
//        if(loan.getMyInvestment() != null) {
//            holder.invested.setText(String.format(context.getString(R.string.myInvestment), loan.getMyInvestment().getAmount()));
//        } else {
//            holder.invested.setText("");
//        }
//
//        Picasso.with(context)
//                .load(ZonkyClient.BASE_URL+loan.getPhotos().get(0).getUrl())
//                .resize(100, 77)
//                .onlyScaleDown()
//                .into(holder.storyImage);
    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }
}