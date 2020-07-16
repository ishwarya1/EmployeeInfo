package sg.edu.rp.soi.employeeinfo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class CustomerAdapter extends ArrayAdapter {
    Context parent_context;
    int id;
    ArrayList<EmployeeArrayList> listVersion;
    public  CustomerAdapter(Context context, int resource, ArrayList<EmployeeArrayList> object) {

        super(context,resource,object);

        parent_context = context;

        id = resource;

        listVersion = object;
    }
    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(id,parent,false);
        TextView tvName = rowView.findViewById(R.id.tvname);
        TextView tvTitle = rowView.findViewById(R.id.tvtitle);
        TextView tvSalary = rowView.findViewById(R.id.tvsalary);
        EmployeeArrayList currentVersion = listVersion.get(position);
        tvName.setText(currentVersion.getName());
        tvTitle.setText(currentVersion.getTitle());
        tvSalary.setText(currentVersion.getSalary()+"");
        return rowView;
    }
}