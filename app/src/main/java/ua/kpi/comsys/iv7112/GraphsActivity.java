package ua.kpi.comsys.iv7112;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class GraphsActivity extends AppCompatActivity {

    private boolean hasLabels = true;
    private boolean hasCenterCircle = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);

        RadioButton graphRadio = (RadioButton) findViewById(R.id.radio_graph);
        graphRadio.setOnClickListener(radioButtonClickListener);

        RadioButton diagramRadio = (RadioButton) findViewById(R.id.radio_diagram);
        diagramRadio.setOnClickListener(radioButtonClickListener);

    }

    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            GraphView graph = (GraphView) findViewById(R.id.graph);
            PieChartView diagram = (PieChartView) findViewById(R.id.diagram);
            RadioButton rb = (RadioButton) v;
            switch (rb.getId()) {
                case R.id.radio_graph:
                    diagram.setVisibility(View.GONE);
                    graph.setVisibility(View.VISIBLE);
                    LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(graphX3());
                    graph.setTitle("y = x^3");
                    graph.setTitleColor(Color.BLACK);
                    series.setColor(Color.RED);
                    graph.getGridLabelRenderer().setVerticalLabelsSecondScaleColor(Color.RED);
                    graph.getGridLabelRenderer().setGridColor(Color.BLACK);
                    graph.getGridLabelRenderer().setVerticalLabelsColor(Color.BLACK);
                    graph.getGridLabelRenderer().setHorizontalLabelsColor(Color.BLACK);
                    graph.addSeries(series);
                    break;
                case R.id.radio_diagram:
                    PieChartData data;
                    graph.setVisibility(View.GONE);
                    diagram.setVisibility(View.VISIBLE);

                    List<SliceValue> values = new ArrayList<SliceValue>();
                    values.add(new SliceValue(30, Color.YELLOW));
                    values.add(new SliceValue(30, Color.GREEN));
                    values.add(new SliceValue(40, Color.BLACK));

                    data = new PieChartData(values);
                    data.setHasLabels(hasLabels);
                    data.setHasCenterCircle(hasCenterCircle);

                    diagram.setPieChartData(data);
                    break;
                default:
                    break;
            }
        }
    };

    public DataPoint[] graphX3() {
        int arrLength = 65;
        double tempX, tempY;
        tempX = -3;
        DataPoint[] result = new DataPoint[arrLength];
        for (int i = 0; i < arrLength; i++) {
            tempY = Math.pow(tempX, 3);
            result[i] = new DataPoint(tempX, tempY);
            tempX += 0.1;
        }
        return result;
    }
}