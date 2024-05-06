import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from 'src/app/model/user/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {

  user: User

  constructor(private userService: UserService, private router:Router, private route: ActivatedRoute) { 
    this.user = new User();

  }

  onSubmit(){
    console.log(this.user);
    
    this.userService.save(this.user).subscribe(res=>this.redirect());
  }

  redirect(){
    this.router.navigate(['/users'])
  }

}
