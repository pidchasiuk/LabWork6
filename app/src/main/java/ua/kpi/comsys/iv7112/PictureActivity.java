package ua.kpi.comsys.iv7112;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class PictureActivity extends AppCompatActivity {


    private ImageView imView1;
    private ImageView imView2;
    private ImageView imView3;
    private ImageView imView4;
    private ImageView imView5;
    private ImageView imView6;
    private ImageView imView7;
    private ImageView imView8;
    private ImageView imView9;
    private ImageView imView10;
    private ImageView imView11;
    private ImageView imView12;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pictures);

        imView1 = (ImageView) findViewById(R.id.imageView1);
        imView2 = (ImageView) findViewById(R.id.imageView2);
        imView3 = (ImageView) findViewById(R.id.imageView3);
        imView4 = (ImageView) findViewById(R.id.imageView4);
        imView5 = (ImageView) findViewById(R.id.imageView5);
        imView6 = (ImageView) findViewById(R.id.imageView6);
        imView7 = (ImageView) findViewById(R.id.imageView7);
        imView8 = (ImageView) findViewById(R.id.imageView8);
        imView9 = (ImageView) findViewById(R.id.imageView9);
        imView10 = (ImageView) findViewById(R.id.imageView10);
        imView11 = (ImageView) findViewById(R.id.imageView11);
        imView12 = (ImageView) findViewById(R.id.imageView12);
        Button PickImage = (Button) findViewById(R.id.buttonPicture);
        PickImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter += 1;
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, counter);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView1.setImageBitmap(selectedImage);
                        imView1.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 2:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView2.setImageBitmap(selectedImage);
                        imView2.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView3.setImageBitmap(selectedImage);
                        imView3.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 4:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView4.setImageBitmap(selectedImage);
                        imView4.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 5:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView5.setImageBitmap(selectedImage);
                        imView5.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 6:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView6.setImageBitmap(selectedImage);
                        imView6.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 7:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView7.setImageBitmap(selectedImage);
                        imView7.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 8:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView8.setImageBitmap(selectedImage);
                        imView8.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 9:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView9.setImageBitmap(selectedImage);
                        imView9.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 10:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView10.setImageBitmap(selectedImage);
                        imView10.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 11:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView11.setImageBitmap(selectedImage);
                        imView11.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 12:
                if (resultCode == RESULT_OK) {
                    try {

                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imView12.setImageBitmap(selectedImage);
                        imView12.setBackgroundColor(Color.rgb(105, 105, 105));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                break;
        }
    }
}