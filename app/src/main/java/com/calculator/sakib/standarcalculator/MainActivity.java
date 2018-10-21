package com.calculator.sakib.standarcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private enum OPERATOR{
        PLUS,SUBTRACT,MULTIPLY,DIVIDE,EQUAL,CLEAR,PERCENT,POWER,ROOT,
    }

    private String currentNumber;
    private String formulaString;
    private String calculationString;


    private String stringNumberAtLeft;
    private String stringNumberAtRight;
    private OPERATOR currentOperator;
    private double calculationResult;

    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;

    public Button buttonDecimal;

    public Button buttonDiv;
    public Button buttonMul;
    public Button buttonAdd;
    public Button buttonSub;

    public Button buttonPercent;
    public Button buttonPower;
    public Button buttonRoot;

    public Button buttonClear;
    public Button buttonDel;
    public ImageButton imgButDel;
    public Button buttonEqual;

    public Button buttonReset;

    public TextView textFormula;
    public TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentNumber = "";
        formulaString = "";
        calculationResult = 0;


        button0 = findViewById(R.id.btn_0);
        button1 = findViewById(R.id.btn_1);
        button2 = findViewById(R.id.btn_2);
        button3 = findViewById(R.id.btn_3);
        button4 = findViewById(R.id.btn_4);
        button5 = findViewById(R.id.btn_5);
        button6 = findViewById(R.id.btn_6);
        button7 = findViewById(R.id.btn_7);
        button8 = findViewById(R.id.btn_8);
        button9 = findViewById(R.id.btn_9);

        buttonDecimal = findViewById(R.id.btn_decimal);

        buttonAdd = findViewById(R.id.btn_plus);
        buttonMul = findViewById(R.id.btn_multiply);
        buttonDiv = findViewById(R.id.btn_divide);
        buttonSub = findViewById(R.id.btn_minus);


        buttonPercent = findViewById(R.id.btn_percent);
        buttonPower = findViewById(R.id.btn_power);
        buttonRoot = findViewById(R.id.btn_root);

        buttonClear = findViewById(R.id.btn_clear);
        //buttonDel = findViewById(R.id.btn_del);
        imgButDel = findViewById(R.id.img_btn_del);
        //buttonReset = findViewById(R.id.btn_reset);
        buttonEqual = findViewById(R.id.btn_equals);

        textFormula = findViewById(R.id.formula);
        textResult = findViewById(R.id.result);

        textResult.setText("0");
        textFormula.setText("0");


        button0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        imgButDel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getButtonClickId(view);
            }
        });


    }


    public void getButtonClickId(View v)
    {
        //textView.setText("Button A");
        switch (v.getId())
        {
            case R.id.btn_0:
                //textView.setText("0");
                numberIsTapped(0);
                break;
            case R.id.btn_1:
                //textView.setText("0");
                numberIsTapped(1);
                break;
            case R.id.btn_2:
                //textView.setText("0");
                numberIsTapped(2);
                break;
            case R.id.btn_3:
                //textView.setText("0");
                numberIsTapped(3);
                break;
            case R.id.btn_4:
                //textView.setText("0");
                numberIsTapped(4);
                break;
            case R.id.btn_5:
                //textView.setText("0");
                numberIsTapped(5);
                break;
            case R.id.btn_6:
                //textView.setText("0");
                numberIsTapped(6);
                break;
            case R.id.btn_7:
                //textView.setText("0");
                numberIsTapped(7);
                break;
            case R.id.btn_8:
                //textView.setText("0");
                numberIsTapped(8);
                break;
            case R.id.btn_9:
                //textView.setText("0");
                numberIsTapped(9);
                break;

            case R.id.btn_decimal:
                numberIsTapped(-1);
                break;

            case R.id.btn_plus:
                operatorIsTapped(OPERATOR.PLUS);
                    calculationString += " + ";
                    formulaString +=  " + ";
                textFormula.setText(formulaString);

                    break;

            case R.id.btn_multiply:
                operatorIsTapped(OPERATOR.MULTIPLY);
                calculationString += " * ";
                formulaString +=  " * ";
                textFormula.setText(formulaString);
                break;

            case R.id.btn_divide:
                operatorIsTapped(OPERATOR.DIVIDE);
                calculationString += " / ";
                formulaString +=  " / ";
                textFormula.setText(formulaString);

                break;

            case R.id.btn_minus:
                operatorIsTapped(OPERATOR.SUBTRACT);
                calculationString += " - ";
                formulaString +=  " - ";
                textFormula.setText(formulaString);

                break;

            case R.id.btn_percent:
                //operatorIsTapped(OPERATOR.PERCENT);
                calculationResult = Double.parseDouble(currentNumber)/100;
                formulaString +=  "%";

                textFormula.setText(formulaString);
                textResult.setText(String.valueOf(calculationResult));

                break;

            case R.id.btn_power:
                operatorIsTapped(OPERATOR.POWER);
                formulaString +=  " ^ ";
                textFormula.setText(formulaString);

                break;
            case R.id.btn_root:
                //operatorIsTapped(OPERATOR.ROOT);

                break;

            case R.id.btn_clear:
                //operatorIsTapped(OPERATOR.CLEAR);
                currentNumber = "";
                formulaString = "";
                calculationString = "";
                stringNumberAtLeft = "";
                stringNumberAtRight = "";
                calculationResult = 0;
                textFormula.setText("0");
                textResult.setText("0");
                currentOperator = null;

                break;

            case R.id.img_btn_del:
                if(currentNumber.length() == 1)
                {
                    currentNumber = "";
                    formulaString = formulaString.substring(0, formulaString.length() - 1);

                    textFormula.setText(formulaString);
                    textResult.setText("0");
                }
                else if (currentNumber != null && currentNumber.length() > 1 )
                {
                    currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
                    formulaString = formulaString.substring(0, formulaString.length() - 1);

                    textFormula.setText(formulaString);
                    textResult.setText((currentNumber));
                }

                break;

            case R.id.btn_equals:
                operatorIsTapped(OPERATOR.EQUAL);
                break;


        }
    }

    private void numberIsTapped(int tappedNumber)
    {
        if(currentOperator == OPERATOR.EQUAL)
        {
            currentOperator = null;
            calculationResult = 0.0;
            formulaString += "; ";
        }
        if(tappedNumber == -1)
        {
            formulaString += ".";
            textFormula.setText(formulaString);

            currentNumber = currentNumber + ".";
            textResult.setText((currentNumber));
            calculationString = currentNumber;
        }
        else
        {
            formulaString += String.valueOf(tappedNumber);
            textFormula.setText(formulaString);

            currentNumber = currentNumber + String.valueOf(tappedNumber);
            textResult.setText((currentNumber));
            calculationString = currentNumber;
        }
    }

    private void operatorIsTapped(OPERATOR tappedOperator)
    {
        if(currentOperator != null )
        {
            if (currentNumber != "")
            {

                stringNumberAtRight = currentNumber;
                currentNumber = "";

                switch (currentOperator)
                {
                    case PLUS:
                        calculationResult = Double.parseDouble(stringNumberAtLeft) +
                                Double.parseDouble(stringNumberAtRight);
                        break;
                    case SUBTRACT:
                        calculationResult = Double.parseDouble(stringNumberAtLeft) -
                                Double.parseDouble(stringNumberAtRight);
                        break;
                    case DIVIDE:
                        calculationResult = Double.parseDouble(stringNumberAtLeft) /
                                Double.parseDouble(stringNumberAtRight);
                        break;
                    case MULTIPLY:
                        calculationResult = Double.parseDouble(stringNumberAtLeft) *
                                Double.parseDouble(stringNumberAtRight);
                        break;

                    case EQUAL:
                        stringNumberAtLeft = String.valueOf(calculationResult);
                        //textResult.setText(String.valueOf(calculationResult));
                        formulaString += "; ";
                        formulaString += stringNumberAtLeft;
                        textFormula.setText(formulaString);
                        break;

                    case POWER:
                        calculationResult = Math.pow(Double.parseDouble(stringNumberAtLeft) ,
                                Double.parseDouble(stringNumberAtRight));

                        break;

                }

                stringNumberAtLeft = String.valueOf(calculationResult);

                textResult.setText(stringNumberAtLeft);
                //calculationString = stringNumberAtLeft;
            }

            if(currentOperator == OPERATOR.POWER && currentNumber == "")
            {
                return;
            }
        }

        else
        {
            stringNumberAtLeft = currentNumber;
            currentNumber = "";
        }

        if(currentOperator == null && stringNumberAtLeft == "")
            return;

        currentOperator = tappedOperator;
    }












}
