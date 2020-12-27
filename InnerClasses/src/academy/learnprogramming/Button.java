package academy.learnprogramming;

import java.io.ObjectStreamClass;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        // this is passed parameter of OnClickListener
        // this assigns an object to the button in order to be able to
        // handle those clicks
    }
    public void onClick() {
        this.onClickListener.onClick(this.title);
    }
    public interface OnClickListener {
        public void onClick(String title);
        // this is passing on fact that there has been a click
        // which is using the OnClickListener field
        // and calling OnClick method itself.
    }
}
