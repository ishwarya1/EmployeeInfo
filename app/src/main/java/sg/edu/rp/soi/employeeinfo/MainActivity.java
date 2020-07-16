package sg.edu.rp.soi.employeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<EmployeeArrayList> arrayList;
    CustomerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv);

        arrayList = new ArrayList<>();
        arrayList.add(new EmployeeArrayList("John", "Software Technical Leader","3400.0"));
        arrayList.add(new EmployeeArrayList("May","Programmer","2200.0"));
        adapter = new CustomerAdapter(this,R.layout.row,arrayList);
        listView.setAdapter(adapter);
    }
}
