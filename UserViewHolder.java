package userstorage.viikko9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageUser;
    TextView firstName, lastName, email, type, degrees;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUser = itemView.findViewById(R.id.imageViewUser);
        firstName = itemView.findViewById(R.id.textViewFirstName);
        lastName = itemView.findViewById(R.id.textViewLastName);
        email = itemView.findViewById(R.id.textViewEmail);
        type = itemView.findViewById(R.id.textViewType);
        degrees = itemView.findViewById(R.id.textViewDegrees);
    }
}
