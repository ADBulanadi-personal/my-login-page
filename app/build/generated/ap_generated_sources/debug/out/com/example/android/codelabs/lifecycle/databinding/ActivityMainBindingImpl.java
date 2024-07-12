package com.example.android.codelabs.lifecycle.databinding;
import com.example.android.codelabs.lifecycle.R;
import com.example.android.codelabs.lifecycle.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.example.android.codelabs.lifecycle.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.LoginText, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener passwordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.Password.getValue()
            //         is loginViewModel.Password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(password);
            // localize variables for thread safety
            // loginViewModel.Password.getValue()
            java.lang.String loginViewModelPasswordGetValue = null;
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.Password != null
            boolean loginViewModelPasswordJavaLangObjectNull = false;
            // loginViewModel.Password
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
            // loginViewModel
            com.example.android.lifecycles.ViewModel.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelPassword = loginViewModel.Password;

                loginViewModelPasswordJavaLangObjectNull = (loginViewModelPassword) != (null);
                if (loginViewModelPasswordJavaLangObjectNull) {




                    loginViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener usernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.Username.getValue()
            //         is loginViewModel.Username.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(username);
            // localize variables for thread safety
            // loginViewModel.Username.getValue()
            java.lang.String loginViewModelUsernameGetValue = null;
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.Username
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelUsername = null;
            // loginViewModel.Username != null
            boolean loginViewModelUsernameJavaLangObjectNull = false;
            // loginViewModel
            com.example.android.lifecycles.ViewModel.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelUsername = loginViewModel.Username;

                loginViewModelUsernameJavaLangObjectNull = (loginViewModelUsername) != (null);
                if (loginViewModelUsernameJavaLangObjectNull) {




                    loginViewModelUsername.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            );
        this.LoginButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.password.setTag(null);
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.android.codelabs.lifecycle.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.example.android.lifecycles.ViewModel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.example.android.lifecycles.ViewModel.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelUsername((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelUsername(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String loginViewModelUsernameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
        java.lang.String loginViewModelPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelUsername = null;
        com.example.android.lifecycles.ViewModel.LoginViewModel loginViewModel = mLoginViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.Password
                        loginViewModelPassword = loginViewModel.Password;
                    }
                    updateLiveDataRegistration(0, loginViewModelPassword);


                    if (loginViewModelPassword != null) {
                        // read loginViewModel.Password.getValue()
                        loginViewModelPasswordGetValue = loginViewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.Username
                        loginViewModelUsername = loginViewModel.Username;
                    }
                    updateLiveDataRegistration(1, loginViewModelUsername);


                    if (loginViewModelUsername != null) {
                        // read loginViewModel.Username.getValue()
                        loginViewModelUsernameGetValue = loginViewModelUsername.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.LoginButton.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.password, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.username, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, usernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.password, loginViewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.username, loginViewModelUsernameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // loginViewModel != null
        boolean loginViewModelJavaLangObjectNull = false;
        // loginViewModel
        com.example.android.lifecycles.ViewModel.LoginViewModel loginViewModel = mLoginViewModel;



        loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
        if (loginViewModelJavaLangObjectNull) {



            loginViewModel.onClick(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel.Password
        flag 1 (0x2L): loginViewModel.Username
        flag 2 (0x3L): loginViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}