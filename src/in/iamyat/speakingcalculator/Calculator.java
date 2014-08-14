package in.iamyat.speakingcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity implements OnClickListener {

	Button nine, eight, seven, six, five, four, three, two, one, zero, decimal,
			add, subtract, divide, multiply, equal, clear;
	EditText mEditText;
	int operator1;
	int operator2;
	String operator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);

		nine = (Button) findViewById(R.id.button9);
		eight = (Button) findViewById(R.id.button8);
		seven = (Button) findViewById(R.id.button7);
		six = (Button) findViewById(R.id.button6);
		five = (Button) findViewById(R.id.button5);
		four = (Button) findViewById(R.id.button4);
		three = (Button) findViewById(R.id.button3);
		two = (Button) findViewById(R.id.button2);
		one = (Button) findViewById(R.id.button1);
		zero = (Button) findViewById(R.id.buttonZero);
		decimal = (Button) findViewById(R.id.buttonDecimal);
		add = (Button) findViewById(R.id.buttonAdd);
		subtract = (Button) findViewById(R.id.buttonSubtract);
		divide = (Button) findViewById(R.id.buttonDivide);
		multiply = (Button) findViewById(R.id.buttonMultiply);
		equal = (Button) findViewById(R.id.buttonEqual);
		clear = (Button) findViewById(R.id.buttonClear);

		mEditText = (EditText) findViewById(R.id.displayNumber1);

		try {
			nine.setOnClickListener(this);
			eight.setOnClickListener(this);
			seven.setOnClickListener(this);
			six.setOnClickListener(this);
			five.setOnClickListener(this);
			four.setOnClickListener(this);
			three.setOnClickListener(this);
			two.setOnClickListener(this);
			one.setOnClickListener(this);
			zero.setOnClickListener(this);
			decimal.setOnClickListener(this);
			add.setOnClickListener(this);
			subtract.setOnClickListener(this);
			divide.setOnClickListener(this);
			multiply.setOnClickListener(this);
			equal.setOnClickListener(this);
			clear.setOnClickListener(this);
		} catch (Exception e) {

		}

	}

	@Override
	public void onClick(View v) {
		Editable str = mEditText.getText();
		switch (v.getId()) {
		case R.id.buttonZero:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(zero.getText());
			mEditText.setText(str);
			break;
		case R.id.button1:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(one.getText());
			mEditText.setText(str);
			break;
		case R.id.button2:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(two.getText());
			mEditText.setText(str);
			break;
		case R.id.button3:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(three.getText());
			mEditText.setText(str);
			break;
		case R.id.button4:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(four.getText());
			mEditText.setText(str);
			break;
		case R.id.button5:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(five.getText());
			mEditText.setText(str);
			break;
		case R.id.button6:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(six.getText());
			mEditText.setText(str);
			break;
		case R.id.button7:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(seven.getText());
			mEditText.setText(str);
			break;
		case R.id.button8:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(eight.getText());
			mEditText.setText(str);
			break;
		case R.id.button9:
			if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText(" ");
			}
			str = str.append(nine.getText());
			mEditText.setText(str);
			break;
		case R.id.buttonAdd:
			operator = "+";
			if (operator1 == 0) {
				operator1 = Integer.parseInt(mEditText.getText().toString());
				mEditText.setText("");
			} else if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText("");
			} else {
				operator2 = Integer.parseInt(mEditText.getText().toString());
				mEditText.setText("");
				operator1 = operator1 + operator2;
				mEditText.setText("Answer: " + Integer.toString(operator1));
			}
			break;
		case R.id.buttonSubtract:
			operator = "-";
			if (operator1 == 0) {
				operator1 = Integer.parseInt(mEditText.getText().toString());
				mEditText.setText("");
			} else if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText("");
			} else {
				operator2 = Integer.parseInt(mEditText.getText().toString());
				mEditText.setText("");
				operator1 = operator1 - operator2;
				mEditText.setText("Answer: " + Integer.toString(operator1));
			}
			break;
		case R.id.buttonMultiply:
			operator = "*";
			if (operator1 == 0) {
				operator1 = Integer.parseInt(mEditText.getText().toString());
				mEditText.setText("");
			} else if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText("");
			} else {
				operator2 = Integer.parseInt(mEditText.getText().toString());
				mEditText.setText("");
				operator1 = operator1 * operator2;
				mEditText.setText("Answer: " + Integer.toString(operator1));
			}
			break;
		case R.id.buttonDivide:
			operator = "/";
			if (operator1 == 0) {
				operator1 = Integer.parseInt(mEditText.getText().toString());
				mEditText.setText("");
			} else if (operator2 != 0) {
				operator2 = 0;
				mEditText.setText("");
			} else {
				operator2 = Integer.parseInt(mEditText.getText().toString());
				mEditText.setText("");
				operator1 = operator1 / operator2;
				mEditText.setText( Integer.toString(operator1));
			}
			break;
		case R.id.buttonEqual:
			if (!operator.equals(null)) {
				if (operator2 != 0) {
					if (operator.equals("+")) {
						mEditText.setText("");
						mEditText.setText("Answer: "
								+ Integer.toString(operator1));
					} else if (operator.equals("-")) {
						mEditText.setText("");
						mEditText.setText("Answer: "
								+ Integer.toString(operator1));
					} else if (operator.equals("*")) {
						mEditText.setText("");
						mEditText.setText("Answer: "
								+ Integer.toString(operator1));
					} else if (operator.equals("/")) {
						mEditText.setText("");
						mEditText.setText("Answer: "
								+ Integer.toString(operator1));
					}
				}
				else {
					operation();
				}
			}
			break;
		case R.id.buttonClear:
			operator1 = 0;
			operator2 = 0;
			mEditText.setText("");
			mEditText.setHint("Enter Number");
			break;
		}

	}

	private void operation() {
		if (operator.equals("+")) {
			operator2 = Integer.parseInt(mEditText.getText().toString());
			mEditText.setText("");
			operator1 = operator1 + operator2;
			mEditText.setText("Answer: " + Integer.toString(operator1));
		} else if (operator.equals("-")) {
			operator2 = Integer.parseInt(mEditText.getText().toString());
			mEditText.setText("");
			operator1 = operator1 - operator2;
			mEditText.setText("Answer: " + Integer.toString(operator1));
		} else if (operator.equals("*")) {
			operator2 = Integer.parseInt(mEditText.getText().toString());
			mEditText.setText("");
			operator1 = operator1 * operator2;
			mEditText.setText("Answer: " + Integer.toString(operator1));
		} else if (operator.equals("/")) {
			operator2 = Integer.parseInt(mEditText.getText().toString());
			mEditText.setText("");
			operator1 = operator1 / operator2;
			mEditText.setText("Answer: " + Integer.toString(operator1));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
