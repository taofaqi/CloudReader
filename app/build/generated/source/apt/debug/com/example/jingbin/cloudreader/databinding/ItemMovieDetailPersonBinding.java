package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ItemMovieDetailPersonBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_item, 4);
    }
    // views
    public final android.widget.ImageView ivAvatar;
    public final android.widget.LinearLayout llItem;
    private final android.widget.RelativeLayout mboundView0;
    private final android.widget.TextView mboundView2;
    private final android.widget.TextView mboundView3;
    // variables
    private com.example.jingbin.cloudreader.bean.moviechild.PersonBean mPersonBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMovieDetailPersonBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.ivAvatar = (android.widget.ImageView) bindings[1];
        this.ivAvatar.setTag(null);
        this.llItem = (android.widget.LinearLayout) bindings[4];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            case BR.personBean :
                setPersonBean((com.example.jingbin.cloudreader.bean.moviechild.PersonBean) variable);
                return true;
        }
        return false;
    }

    public void setPersonBean(com.example.jingbin.cloudreader.bean.moviechild.PersonBean personBean) {
        updateRegistration(1, personBean);
        this.mPersonBean = personBean;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.personBean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.moviechild.PersonBean getPersonBean() {
        return mPersonBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAvatarsPerso((com.example.jingbin.cloudreader.bean.moviechild.ImagesBean) object, fieldId);
            case 1 :
                return onChangePersonBean((com.example.jingbin.cloudreader.bean.moviechild.PersonBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAvatarsPerso(com.example.jingbin.cloudreader.bean.moviechild.ImagesBean avatarsPersonBean, int fieldId) {
        switch (fieldId) {
            case BR.large: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
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
    private boolean onChangePersonBean(com.example.jingbin.cloudreader.bean.moviechild.PersonBean personBean, int fieldId) {
        switch (fieldId) {
            case BR.avatars: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
            case BR.name: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR.type: {
                synchronized(this) {
                        mDirtyFlags |= 0x10L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
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
        java.lang.String largeAvatarsPersonBe = null;
        com.example.jingbin.cloudreader.bean.moviechild.ImagesBean avatarsPersonBean = null;
        java.lang.String namePersonBean = null;
        com.example.jingbin.cloudreader.bean.moviechild.PersonBean personBean = mPersonBean;
        java.lang.String typePersonBean = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x27L) != 0) {

                    if (personBean != null) {
                        // read personBean.avatars
                        avatarsPersonBean = personBean.getAvatars();
                    }
                    updateRegistration(0, avatarsPersonBean);


                    if (avatarsPersonBean != null) {
                        // read personBean.avatars.large
                        largeAvatarsPersonBe = avatarsPersonBean.getLarge();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (personBean != null) {
                        // read personBean.name
                        namePersonBean = personBean.getName();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (personBean != null) {
                        // read personBean.type
                        typePersonBean = personBean.getType();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x27L) != 0) {
            // api target 1

            com.example.jingbin.cloudreader.utils.ImgLoadUtil.showImg(this.ivAvatar, largeAvatarsPersonBe);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, namePersonBean);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, typePersonBean);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ItemMovieDetailPersonBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemMovieDetailPersonBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemMovieDetailPersonBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_movie_detail_person, root, attachToRoot, bindingComponent);
    }
    public static ItemMovieDetailPersonBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemMovieDetailPersonBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_movie_detail_person, null, false), bindingComponent);
    }
    public static ItemMovieDetailPersonBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemMovieDetailPersonBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_movie_detail_person_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemMovieDetailPersonBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): personBean.avatars
        flag 1 (0x2L): personBean
        flag 2 (0x3L): personBean.avatars.large
        flag 3 (0x4L): personBean.name
        flag 4 (0x5L): personBean.type
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}