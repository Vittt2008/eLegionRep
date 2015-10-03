package com.e.legion.test.app.databinding;
import com.e.legion.test.app.R;
import com.e.legion.test.app.BR;
import android.view.View;
public class FragmentProfileBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(3);
        sIncludes.setIncludes(0, 
            new String[] {"include_user_profile"},
            new int[] {1},
            new int[] {R.layout.include_user_profile});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.pb_uer_profile, 2);
    }
    // views
    private final com.e.legion.test.app.databinding.IncludeUserProfileBinding mboundView0;
    private final android.widget.FrameLayout mboundView01;
    public final android.widget.ProgressBar pbUerProfile;
    // variables
    private com.e.legion.test.app.entities.User mUser;
    // values
    // listeners
    
    public FragmentProfileBinding(View root) {
        super(root, 0);
        final Object[] bindings = mapBindings(root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (com.e.legion.test.app.databinding.IncludeUserProfileBinding) bindings[1];
        this.mboundView01 = (android.widget.FrameLayout) bindings[0];
        this.mboundView01.setTag(null);
        this.pbUerProfile = (android.widget.ProgressBar) bindings[2];
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b10L;
        }
        mboundView0.invalidateAll();
        requestRebind();
    }
    
    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView0.hasPendingBindings()) {
            return true;
        }
        return false;
    }
    
    private void log(String msg, long i) {
        android.util.Log.d("BINDER", msg + ":" + Long.toHexString(i));
    }
    
    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.user :
                setUser((com.e.legion.test.app.entities.User) variable);
                return true;
        }
        return false;
    }
    
    public void setUser(com.e.legion.test.app.entities.User user) {
        this.mUser = user;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public com.e.legion.test.app.entities.User getUser() {
        return mUser;
    }
    
    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.e.legion.test.app.entities.User user = mUser;
    
        if ((dirtyFlags & 0b11L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.mboundView0.setUser(user);
        }
        mboundView0.executePendingBindings();
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static FragmentProfileBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return android.databinding.DataBindingUtil.<FragmentProfileBinding>inflate(inflater, com.e.legion.test.app.R.layout.fragment_profile, root, attachToRoot);
    }
    public static FragmentProfileBinding inflate(android.view.LayoutInflater inflater) {
        return bind(inflater.inflate(com.e.legion.test.app.R.layout.fragment_profile, null, false));
    }
    public static FragmentProfileBinding bind(android.view.View view) {
        if (!"layout/fragment_profile_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentProfileBinding(view);
    }
}
    /* flag mapping
        flag 0: user~
        flag 1: INVALIDATE ANY
    flag mapping end*/
    //end