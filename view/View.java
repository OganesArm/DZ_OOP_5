package DZ_Seminar5.view;

import DZ_Seminar5.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
}