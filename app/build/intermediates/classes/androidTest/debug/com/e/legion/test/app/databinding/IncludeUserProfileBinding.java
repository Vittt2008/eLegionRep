package com.e.legion.test.app.databinding;
import com.e.legion.test.app.R;
import com.e.legion.test.app.BR;
import android.view.View;
public class IncludeUserProfileBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_photo, 10);
    }
    // views
    public final android.widget.Button btExit;
    public final android.widget.ImageView ivPhoto;
    public final android.widget.LinearLayout llProfile;
    public final android.widget.TextView tvCompany;
    public final android.widget.TextView tvEmail;
    public final android.widget.TextView tvFollowers;
    public final android.widget.TextView tvFollowing;
    public final android.widget.TextView tvLocation;
    public final android.widget.TextView tvName;
    public final android.widget.TextView tvPublicRepos;
    public final android.widget.TextView tvTotalPrivateRepos;
    // variables
    private com.e.legion.test.app.entities.User mUser;
    // values
    // listeners
    
    public IncludeUserProfileBinding(View root) {
        super(root, 0);
        final Object[] bindings = mapBindings(root, 11, sIncludes, sViewsWithIds);
        this.btExit = (android.widget.Button) bindings[9];
        this.btExit.setTag(null);
        this.ivPhoto = (android.widget.ImageView) bindings[10];
        this.llProfile = (android.widget.LinearLayout) bindings[0];
        this.llProfile.setTag(null);
        this.tvCompany = (android.widget.TextView) bindings[2];
        this.tvCompany.setTag(null);
        this.tvEmail = (android.widget.TextView) bindings[4];
        this.tvEmail.setTag(null);
        this.tvFollowers = (android.widget.TextView) bindings[7];
        this.tvFollowers.setTag(null);
        this.tvFollowing = (android.widget.TextView) bindings[8];
        this.tvFollowing.setTag(null);
        this.tvLocation = (android.widget.TextView) bindings[3];
        this.tvLocation.setTag(null);
        this.tvName = (android.widget.TextView) bindings[1];
        this.tvName.setTag(null);
        this.tvPublicRepos = (android.widget.TextView) bindings[5];
        this.tvPublicRepos.setTag(null);
        this.tvTotalPrivateRepos = (android.widget.TextView) bindings[6];
        this.tvTotalPrivateRepos.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b10L;
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
        int totalPrivateReposUser = 0;
        java.lang.String AndroidStringFollowingFollowingUser = null;
        java.lang.String AndroidStringPublicReposPublicReposUser = null;
        boolean logicalNotTextUtilsIsEmptyTextUtilsEmailUser = false;
        boolean logicalNotTextUtilsIsEmptyTextUtilsCompanyUser = false;
        boolean TextUtilsIsEmptyTextUtilsNameUser = false;
        java.lang.String AndroidStringCompanyCompanyUser = null;
        boolean logicalNotTextUtilsIsEmptyTextUtilsLocationUser = false;
        boolean UserObjectnull = false;
        java.lang.String AndroidStringTotalPrivateReposTotalPrivateReposUser = null;
        java.lang.String AndroidStringFollowersFollowersUser = null;
        boolean TextUtilsIsEmptyTextUtilsLocationUser = false;
        int UserObjectnullVISIBLEViewGONEView = 0;
        boolean TextUtilsIsEmptyTextUtilsEmailUser = false;
        int LogicalNotTextUtilsIsEmptyTextUtilsLocationUserVISIBLEViewGONEView = 0;
        com.e.legion.test.app.entities.User user = mUser;
        int LogicalNotTextUtilsIsEmptyTextUtilsCompanyUserVISIBLEViewGONEView = 0;
        java.lang.String AndroidStringNameNameUser = null;
        int followersUser = 0;
        java.lang.String AndroidStringEmailEmailUser = null;
        java.lang.String emailUser = null;
        boolean logicalNotTextUtilsIsEmptyTextUtilsNameUser = false;
        int followingUser = 0;
        java.lang.String AndroidStringLocationLocationUser = null;
        boolean TextUtilsIsEmptyTextUtilsCompanyUser = false;
        int LogicalNotTextUtilsIsEmptyTextUtilsNameUserVISIBLEViewGONEView = 0;
        java.lang.String nameUser = null;
        java.lang.String locationUser = null;
        int LogicalNotTextUtilsIsEmptyTextUtilsEmailUserVISIBLEViewGONEView = 0;
        java.lang.String companyUser = null;
        int publicReposUser = 0;
    
        if ((dirtyFlags & 0b11L) != 0) {
        
        
        
            // read total_private_repos~.~user~
            if ( user != null) {
                totalPrivateReposUser = user.total_private_repos;
            }
        
        
            // read @android:string/total_private_repos~~+~total_private_repos~.~user~
            AndroidStringTotalPrivateReposTotalPrivateReposUser = getRoot().getResources().getString(R.string.total_private_repos)+totalPrivateReposUser;
        
        
            // read !=~user~~Objectnull
            UserObjectnull = user !=null;
            // setting conditional flags
            if (UserObjectnull) {
                dirtyFlags |= 0b1000L;
            } else {
                dirtyFlags |= 0b100L;
            }
        
        
            // read ?:!=~user~~Objectnull~VISIBLE~.~View~~GONE~.~View~
            UserObjectnullVISIBLEViewGONEView = UserObjectnull ? android.view.View.VISIBLE : android.view.View.GONE;
        
        
            // read followers~.~user~
            if ( user != null) {
                followersUser = user.followers;
            }
        
        
            // read @android:string/followers~~+~followers~.~user~
            AndroidStringFollowersFollowersUser = getRoot().getResources().getString(R.string.followers)+followersUser;
        
        
            // read email~.~user~
            if ( user != null) {
                emailUser = user.email;
            }
        
        
            // read TextUtils~~isEmpty~TextUtils~~email~.~user~
            TextUtilsIsEmptyTextUtilsEmailUser = android.text.TextUtils.isEmpty(emailUser);
        
        
            // read logicalNot~TextUtils~~isEmpty~TextUtils~~email~.~user~
            logicalNotTextUtilsIsEmptyTextUtilsEmailUser = !TextUtilsIsEmptyTextUtilsEmailUser;
            // setting conditional flags
            if (logicalNotTextUtilsIsEmptyTextUtilsEmailUser) {
                dirtyFlags |= 0b100000000000L;
            } else {
                dirtyFlags |= 0b10000000000L;
            }
        
        
            // read ?:logicalNot~TextUtils~~isEmpty~TextUtils~~email~.~user~~VISIBLE~.~View~~GONE~.~View~
            LogicalNotTextUtilsIsEmptyTextUtilsEmailUserVISIBLEViewGONEView = logicalNotTextUtilsIsEmptyTextUtilsEmailUser ? android.view.View.VISIBLE : android.view.View.GONE;
        
        
            // read @android:string/email~~+~email~.~user~
            AndroidStringEmailEmailUser = getRoot().getResources().getString(R.string.email)+emailUser;
        
        
            // read following~.~user~
            if ( user != null) {
                followingUser = user.following;
            }
        
        
            // read @android:string/following~~+~following~.~user~
            AndroidStringFollowingFollowingUser = getRoot().getResources().getString(R.string.following)+followingUser;
        
        
            // read name~.~user~
            if ( user != null) {
                nameUser = user.name;
            }
        
        
            // read TextUtils~~isEmpty~TextUtils~~name~.~user~
            TextUtilsIsEmptyTextUtilsNameUser = android.text.TextUtils.isEmpty(nameUser);
        
        
            // read logicalNot~TextUtils~~isEmpty~TextUtils~~name~.~user~
            logicalNotTextUtilsIsEmptyTextUtilsNameUser = !TextUtilsIsEmptyTextUtilsNameUser;
            // setting conditional flags
            if (logicalNotTextUtilsIsEmptyTextUtilsNameUser) {
                dirtyFlags |= 0b1000000000L;
            } else {
                dirtyFlags |= 0b100000000L;
            }
        
        
            // read ?:logicalNot~TextUtils~~isEmpty~TextUtils~~name~.~user~~VISIBLE~.~View~~GONE~.~View~
            LogicalNotTextUtilsIsEmptyTextUtilsNameUserVISIBLEViewGONEView = logicalNotTextUtilsIsEmptyTextUtilsNameUser ? android.view.View.VISIBLE : android.view.View.GONE;
        
        
            // read @android:string/name~~+~name~.~user~
            AndroidStringNameNameUser = getRoot().getResources().getString(R.string.name)+nameUser;
        
        
            // read location~.~user~
            if ( user != null) {
                locationUser = user.location;
            }
        
        
            // read TextUtils~~isEmpty~TextUtils~~location~.~user~
            TextUtilsIsEmptyTextUtilsLocationUser = android.text.TextUtils.isEmpty(locationUser);
        
        
            // read logicalNot~TextUtils~~isEmpty~TextUtils~~location~.~user~
            logicalNotTextUtilsIsEmptyTextUtilsLocationUser = !TextUtilsIsEmptyTextUtilsLocationUser;
            // setting conditional flags
            if (logicalNotTextUtilsIsEmptyTextUtilsLocationUser) {
                dirtyFlags |= 0b100000L;
            } else {
                dirtyFlags |= 0b10000L;
            }
        
        
            // read ?:logicalNot~TextUtils~~isEmpty~TextUtils~~location~.~user~~VISIBLE~.~View~~GONE~.~View~
            LogicalNotTextUtilsIsEmptyTextUtilsLocationUserVISIBLEViewGONEView = logicalNotTextUtilsIsEmptyTextUtilsLocationUser ? android.view.View.VISIBLE : android.view.View.GONE;
        
        
            // read @android:string/location~~+~location~.~user~
            AndroidStringLocationLocationUser = getRoot().getResources().getString(R.string.location)+locationUser;
        
        
            // read company~.~user~
            if ( user != null) {
                companyUser = user.company;
            }
        
        
            // read @android:string/company~~+~company~.~user~
            AndroidStringCompanyCompanyUser = getRoot().getResources().getString(R.string.company)+companyUser;
        
        
            // read TextUtils~~isEmpty~TextUtils~~company~.~user~
            TextUtilsIsEmptyTextUtilsCompanyUser = android.text.TextUtils.isEmpty(companyUser);
        
        
            // read logicalNot~TextUtils~~isEmpty~TextUtils~~company~.~user~
            logicalNotTextUtilsIsEmptyTextUtilsCompanyUser = !TextUtilsIsEmptyTextUtilsCompanyUser;
            // setting conditional flags
            if (logicalNotTextUtilsIsEmptyTextUtilsCompanyUser) {
                dirtyFlags |= 0b10000000L;
            } else {
                dirtyFlags |= 0b1000000L;
            }
        
        
            // read ?:logicalNot~TextUtils~~isEmpty~TextUtils~~company~.~user~~VISIBLE~.~View~~GONE~.~View~
            LogicalNotTextUtilsIsEmptyTextUtilsCompanyUserVISIBLEViewGONEView = logicalNotTextUtilsIsEmptyTextUtilsCompanyUser ? android.view.View.VISIBLE : android.view.View.GONE;
        
        
            // read public_repos~.~user~
            if ( user != null) {
                publicReposUser = user.public_repos;
            }
        
        
            // read @android:string/public_repos~~+~public_repos~.~user~
            AndroidStringPublicReposPublicReposUser = getRoot().getResources().getString(R.string.public_repos)+publicReposUser;
        }
        // batch finished
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.btExit.setVisibility(UserObjectnullVISIBLEViewGONEView);
            // api target 1
            this.tvFollowers.setVisibility(UserObjectnullVISIBLEViewGONEView);
            // api target 1
            this.tvFollowing.setVisibility(UserObjectnullVISIBLEViewGONEView);
            // api target 1
            this.tvPublicRepos.setVisibility(UserObjectnullVISIBLEViewGONEView);
            // api target 1
            this.tvTotalPrivateRepos.setVisibility(UserObjectnullVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvCompany.setText(AndroidStringCompanyCompanyUser);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvCompany.setVisibility(LogicalNotTextUtilsIsEmptyTextUtilsCompanyUserVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvEmail.setText(AndroidStringEmailEmailUser);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvEmail.setVisibility(LogicalNotTextUtilsIsEmptyTextUtilsEmailUserVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvFollowers.setText(AndroidStringFollowersFollowersUser);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvFollowing.setText(AndroidStringFollowingFollowingUser);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvLocation.setText(AndroidStringLocationLocationUser);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvLocation.setVisibility(LogicalNotTextUtilsIsEmptyTextUtilsLocationUserVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvName.setText(AndroidStringNameNameUser);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvName.setVisibility(LogicalNotTextUtilsIsEmptyTextUtilsNameUserVISIBLEViewGONEView);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvPublicRepos.setText(AndroidStringPublicReposPublicReposUser);
        }
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.tvTotalPrivateRepos.setText(AndroidStringTotalPrivateReposTotalPrivateReposUser);
        }
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static IncludeUserProfileBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return android.databinding.DataBindingUtil.<IncludeUserProfileBinding>inflate(inflater, com.e.legion.test.app.R.layout.include_user_profile, root, attachToRoot);
    }
    public static IncludeUserProfileBinding inflate(android.view.LayoutInflater inflater) {
        return bind(inflater.inflate(com.e.legion.test.app.R.layout.include_user_profile, null, false));
    }
    public static IncludeUserProfileBinding bind(android.view.View view) {
        if (!"layout/include_user_profile_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new IncludeUserProfileBinding(view);
    }
}
    /* flag mapping
        flag 0: user~
        flag 1: INVALIDATE ANY
        flag 2: ?:!=~user~~Objectnull~VISIBLE~.~View~~GONE~.~View~== false
        flag 3: ?:!=~user~~Objectnull~VISIBLE~.~View~~GONE~.~View~== true
        flag 4: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~location~.~user~~VISIBLE~.~View~~GONE~.~View~== false
        flag 5: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~location~.~user~~VISIBLE~.~View~~GONE~.~View~== true
        flag 6: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~company~.~user~~VISIBLE~.~View~~GONE~.~View~== false
        flag 7: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~company~.~user~~VISIBLE~.~View~~GONE~.~View~== true
        flag 8: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~name~.~user~~VISIBLE~.~View~~GONE~.~View~== false
        flag 9: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~name~.~user~~VISIBLE~.~View~~GONE~.~View~== true
        flag 10: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~email~.~user~~VISIBLE~.~View~~GONE~.~View~== false
        flag 11: ?:logicalNot~TextUtils~~isEmpty~TextUtils~~email~.~user~~VISIBLE~.~View~~GONE~.~View~== true
    flag mapping end*/
    //end