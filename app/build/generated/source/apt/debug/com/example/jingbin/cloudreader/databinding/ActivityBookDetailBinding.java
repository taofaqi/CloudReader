package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ActivityBookDetailBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    public final android.widget.LinearLayout activityBookDetail;
    private final android.widget.TextView mboundView2;
    private final android.widget.TextView mboundView3;
    public final android.widget.TextView tvBookSummary;
    // variables
    private com.example.jingbin.cloudreader.bean.book.BookDetailBean mBookDetailBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBookDetailBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.activityBookDetail = (android.widget.LinearLayout) bindings[0];
        this.activityBookDetail.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.tvBookSummary = (android.widget.TextView) bindings[1];
        this.tvBookSummary.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.bookDetailBean :
                setBookDetailBean((com.example.jingbin.cloudreader.bean.book.BookDetailBean) variable);
                return true;
        }
        return false;
    }

    public void setBookDetailBean(com.example.jingbin.cloudreader.bean.book.BookDetailBean bookDetailBean) {
        updateRegistration(0, bookDetailBean);
        this.mBookDetailBean = bookDetailBean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bookDetailBean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.book.BookDetailBean getBookDetailBean() {
        return mBookDetailBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBookDetailBe((com.example.jingbin.cloudreader.bean.book.BookDetailBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBookDetailBe(com.example.jingbin.cloudreader.bean.book.BookDetailBean bookDetailBean, int fieldId) {
        switch (fieldId) {
            case BR.summary: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.author_intro: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
            case BR.catalog: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
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
        java.lang.String summaryBookDetailBea = null;
        com.example.jingbin.cloudreader.bean.book.BookDetailBean bookDetailBean = mBookDetailBean;
        java.lang.String catalogBookDetailBea = null;
        java.lang.String authorIntroBookDetai = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x13L) != 0) {

                    if (bookDetailBean != null) {
                        // read bookDetailBean.summary
                        summaryBookDetailBea = bookDetailBean.getSummary();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (bookDetailBean != null) {
                        // read bookDetailBean.catalog
                        catalogBookDetailBea = bookDetailBean.getCatalog();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (bookDetailBean != null) {
                        // read bookDetailBean.author_intro
                        authorIntroBookDetai = bookDetailBean.getAuthor_intro();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, authorIntroBookDetai);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, catalogBookDetailBea);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvBookSummary, summaryBookDetailBea);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityBookDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityBookDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityBookDetailBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_book_detail, root, attachToRoot, bindingComponent);
    }
    public static ActivityBookDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityBookDetailBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_book_detail, null, false), bindingComponent);
    }
    public static ActivityBookDetailBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityBookDetailBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_book_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityBookDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bookDetailBean
        flag 1 (0x2L): bookDetailBean.summary
        flag 2 (0x3L): bookDetailBean.author_intro
        flag 3 (0x4L): bookDetailBean.catalog
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}